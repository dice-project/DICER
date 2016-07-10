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

public class Dicer {
    
    public final static String IN_METAMODEL = "./metamodels/ddsm.ecore";
    public final static String IN_METAMODEL_NAME = "DDSM";
    public final static String OUT_METAMODEL = "./metamodels/tosca.ecore";
    public final static String OUT_METAMODEL_NAME = "TOSCA";

    public final static String IN_MODEL = "./models/sample_ddsm.xmi";
    public final static String OUT_MODEL = "./models/sample_tosca.xmi";

    public final static String TRANSFORMATION_DIR = "./transformations/";
    public final static String TRANSFORMATION_MODULE = "ddsm2tosca";

    public static void main(String[] args) throws IOException {
        runme("models/sample_tosca", "models/sample_tosca");
    }

    @SuppressWarnings("unchecked")
    public static void runme(String toscaJsonModelPath, String toscaYamlModelPath) {

        ATLTransformationLauncher l = new ATLTransformationLauncher();
        l.registerInputMetamodel(IN_METAMODEL);
        l.registerOutputMetamodel(OUT_METAMODEL);
        l.launch(IN_MODEL, IN_METAMODEL_NAME, OUT_MODEL, OUT_METAMODEL_NAME, TRANSFORMATION_DIR, TRANSFORMATION_MODULE);
        
        EPackage.Registry.INSTANCE.put("http://tosca/1.0", ToscaPackage.eINSTANCE);

        Injector injector = new ToscaDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet xmiResourceSet = injector.getInstance(ResourceSet.class);

        Resource xmi_resource = (Resource) xmiResourceSet.getResource(URI.createURI(toscaJsonModelPath + ".xmi"), true);

        ResourceSet xtext_resourceSet = injector.getInstance(ResourceSet.class);
        Resource textualModel_resource = (Resource) xtext_resourceSet
                .createResource(URI.createURI(toscaJsonModelPath + ".json"));
        
        textualModel_resource.getContents().add(xmi_resource.getContents().get(0));

        try {
            textualModel_resource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            String actualObj =readFile(toscaJsonModelPath + ".json", Charset.defaultCharset());
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(actualObj);
            Yaml yaml = new Yaml();
            Map<String,Object> map = (Map<String, Object>) yaml.load(node.toString());

            try(  PrintWriter out = new PrintWriter( toscaYamlModelPath + ".yaml" )  ){
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
