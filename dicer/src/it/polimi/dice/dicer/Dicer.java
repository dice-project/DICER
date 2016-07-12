package it.polimi.dice.dicer;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import tosca.*;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import it.polimi.dice.dicer.ToscaDslStandaloneSetup;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Injector;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterDescription;

public class Dicer {
    
    public final static String IN_METAMODEL = "./metamodels/ddsm.ecore";
    public final static String IN_METAMODEL_NAME = "DDSM";
    public final static String OUT_METAMODEL = "./metamodels/tosca.ecore";
    public final static String OUT_METAMODEL_NAME = "TOSCA";

    public final static String IN_MODEL = "./models/sample_ddsm.xmi";
    public final static String OUT_MODEL = "./models/sample_tosca.xmi";

    public final static String TRANSFORMATION_DIR = "./transformations/";
    public final static String TRANSFORMATION_MODULE = "ddsm2tosca";
    
    @Parameter(names = { "-h", "--help", "-help" }, help = true, description = "Shows this help")
    private boolean help = false;
    
    @Parameter(names = "-inModel", description = "The path to the input DDSM model.")
    public String inModelPath = null;
    
    @Parameter(names = "-outModel", description = "The path for the output TOSCA model.")
    public String outModelPath = null;
    

    public static void main(String[] args) throws IOException {
        Dicer dicer = new Dicer();
        JCommander jc = new JCommander(dicer, args);
        System.out.println(dicer.inModelPath + " , " + dicer.outModelPath);
        if (dicer.help) {
            jc.usage();
            System.exit(0);
        } else {
            dicer.runme(dicer.inModelPath, dicer.outModelPath);
        }
    }

    @SuppressWarnings("unchecked")
    public void runme(String inputXMIModelPath, String outModelPath) {

        ATLTransformationLauncher l = new ATLTransformationLauncher();
        l.registerInputMetamodel(IN_METAMODEL);
        l.registerOutputMetamodel(OUT_METAMODEL);
        l.launch(inputXMIModelPath, IN_METAMODEL_NAME, outModelPath + ".xmi", OUT_METAMODEL_NAME, TRANSFORMATION_DIR, TRANSFORMATION_MODULE);
        
        EPackage.Registry.INSTANCE.put("http://tosca/1.0", ToscaPackage.eINSTANCE);

        Injector injector = new ToscaDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet xmiResourceSet = injector.getInstance(ResourceSet.class);

        Resource xmi_resource = (Resource) xmiResourceSet.getResource(URI.createURI(outModelPath + ".xmi"), true);

        ResourceSet xtext_resourceSet = injector.getInstance(ResourceSet.class);
        Resource textualModel_resource = (Resource) xtext_resourceSet
                .createResource(URI.createURI(outModelPath + ".json"));
        
        textualModel_resource.getContents().add(xmi_resource.getContents().get(0));

        try {
            textualModel_resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            String actualObj =readFile(outModelPath + ".json", Charset.defaultCharset());
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(actualObj);
            Yaml yaml = new Yaml();
            Map<String,Object> map = (Map<String, Object>) yaml.load(node.toString());

            try(  PrintWriter out = new PrintWriter( outModelPath + ".yaml" )  ){
                out.println( yaml.dump(map) );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
