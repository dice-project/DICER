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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

public class Dicer {
    private static final Logger logger = LoggerFactory
            .getLogger(Dicer.class);
    
    public final static String IN_METAMODEL_NAME = "DDSM";
    public final static String OUT_METAMODEL_NAME = "TOSCA";
    public final static String TRANSFORMATION_MODULE = "ddsm2tosca";
    
    @Parameter(names = { "-h", "--help", "-help" }, help = true, description = "Shows this help")
    private boolean help = false;
    
    @Parameter(names = "-inModel", description = "The path to the input DDSM model.")
    public String inModelPath = "./models/total.xmi";
    
    @Parameter(names = "-outModel", description = "The path for the output TOSCA model.")
    public String outModelPath = "./models/total_tosca";
    
    @Parameter(names = "-inMetamodel", description = "The path to the DDSM metamodel.")
    public String inMetamodelPath = "./metamodels/ddsm.ecore";
    
    @Parameter(names = "-outMetamodel", description = "The path for the TOSCA metamodel.")
    public String outMetamodelPath = "./metamodels/tosca.ecore";
    
    @Parameter(names = "-transformationDir", description = "The path for the directory containing the ddsm2tosca ATL transformation.")
    public String transformationDir = "./transformations/";
    

    public static void main(String[] args) throws IOException {
        Dicer dicer = new Dicer();
        JCommander jc = new JCommander(dicer, args);
        
        if (dicer.help) {
            jc.usage();
            System.exit(0);
        } else {
            logger.info("Running DICER on input model: " + dicer.inModelPath);
            dicer.runme(dicer.inModelPath, dicer.outModelPath, dicer.inMetamodelPath, dicer.outMetamodelPath, dicer.transformationDir);
        }
    }

    @SuppressWarnings("unchecked")
    public void runme(String inputXMIModelPath, String outModelPath, String inMetamodelPath, String outMetamodelPath, String transformationDir) {

        ATLTransformationLauncher l = new ATLTransformationLauncher();
        logger.info("Running the ATL transformation.");
        
        logger.info("Registering the input DDSM metamodel.");
        l.registerInputMetamodel(inMetamodelPath);
        
        logger.info("Registering the output TOSCA metamodel.");
        l.registerOutputMetamodel(outMetamodelPath);
        
        logger.info("Launching the model-to-model transformation.");
        l.launch(inputXMIModelPath, IN_METAMODEL_NAME, outModelPath + ".xmi", OUT_METAMODEL_NAME, transformationDir, TRANSFORMATION_MODULE);
        
        logger.info("Running the Xtext grammar to serialize the output TOSCA model.");
        EPackage.Registry.INSTANCE.put("http://tosca/1.0", ToscaPackage.eINSTANCE);

        Injector injector = new ToscaDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet xmiResourceSet = injector.getInstance(ResourceSet.class);

        Resource xmi_resource = (Resource) xmiResourceSet.getResource(URI.createURI(outModelPath + ".xmi"), true);

        ResourceSet xtext_resourceSet = injector.getInstance(ResourceSet.class);
        Resource textualModel_resource = (Resource) xtext_resourceSet
                .createResource(URI.createURI(outModelPath + ".json"));
        
        textualModel_resource.getContents().add(xmi_resource.getContents().get(0));
        
        logger.info("Saving the output JSON model.");
        try {
            textualModel_resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            logger.info("Generating TOSCA YAML blueprint from output JSON model.");
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

        logger.info("Completed.");
    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
