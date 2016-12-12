package it.polimi.dice.dicer.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.polimi.dice.dicer.Dicer;

@Path("/")
public class DicerService {
    static Logger log = LoggerFactory.getLogger(DicerService.class);

    private static String transformationDir;
    private static String inMetamodelPath;
    private static String outMetamodelPath;

    private static final Dicer dicer = new Dicer();

    public DicerService(String transformation, String inMetamodel, String outMetamodel) {
        
        log.info("Starting DICER-Service");
        
        log.info("Transformatioon directory: " + transformation);
        log.info("Input DDSM metamodel path: " + inMetamodel);
        log.info("Output TOSCA metamodel path " + outMetamodel);

        transformationDir = transformation;
        inMetamodelPath = inMetamodel;
        outMetamodelPath = outMetamodel;
        
        java.nio.file.Path path = Paths.get("./temp/");

        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                log.error("Problem initializint dicer-service. The 'temp' directory used for temporary operations already exists.");
            }
        }

    }

    @POST
    @Path("/generateToscaBlueprint")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String generateMonitoringInfo(String inputXmiModel) {
        
        try (PrintWriter out = new PrintWriter("./temp/temp_input_model.xmi")) {
            out.println(inputXmiModel);
        } catch (FileNotFoundException e) {
            log.error(e.getMessage(), e.getCause());
        }
        
        dicer.runme("./temp/temp_input_model.xmi", "./temp/temp_input_model_tosca", inMetamodelPath, outMetamodelPath,
                transformationDir, 0);
        
        String blueprint = "";
        try {
            blueprint = readFile("temp/temp_input_model_tosca.yaml", Charset.defaultCharset());
            FileUtils.cleanDirectory(new File("./temp"));
        } catch (IOException e) {
            log.error(e.getMessage(), e.getCause());
        }
        
        return blueprint;
    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
