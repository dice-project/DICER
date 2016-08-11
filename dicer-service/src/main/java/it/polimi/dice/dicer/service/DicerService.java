package it.polimi.dice.dicer.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Path("/")
public class DicerService 
{
    static Logger log = LoggerFactory.getLogger(DicerService.class);

    @POST
    @Path("/generateToscaBlueprint")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public void generateMonitoringInfo(String inputXmiModel) {

    }
}
