package it.polimi.dice.dicer.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.polimi.dice.dicer.Dicer;


@Path("/")
public class DicerService 
{
    static Logger log = LoggerFactory.getLogger(DicerService.class);

    private static String transformationDir;
    private static String inMetamodelPath;
    private static String outMetamodelPath;

    public DicerService(String transformation, String inMetamodel, String outMetamodel) {
        transformationDir = transformation;
        inMetamodelPath = inMetamodel;
        outMetamodelPath = outMetamodel;

    }
    
    @POST
    @Path("/generateToscaBlueprint")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public void generateMonitoringInfo(String inputXmiModel) {
        Dicer dicer = new Dicer();
    }
}
