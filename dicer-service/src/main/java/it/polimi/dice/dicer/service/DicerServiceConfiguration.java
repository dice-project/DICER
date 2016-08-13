package it.polimi.dice.dicer.service;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class DicerServiceConfiguration extends Configuration {
    
    @NotEmpty
    private String transformationDir;

    @NotEmpty
    private String inMetamodelPath;

    @NotEmpty
    private String outMetamodelPath;

    @JsonProperty("transformationDir")
    public String getTransformationDir() {
        return transformationDir;
    }

    @JsonProperty("transformationDir")
    public void setTransformationDir(String transformationDir) {
        this.transformationDir = transformationDir;
    }

    @JsonProperty("inMetamodelPath")
    public String getInMetamodelPath() {
        return inMetamodelPath;
    }

    @JsonProperty("inMetamodelPath")
    public void setInMetamodelPath(String inMetamodelPath) {
        this.inMetamodelPath = inMetamodelPath;
    }

    @JsonProperty("outMetamodelPath")
    public String getOutMetamodelPath() {
        return outMetamodelPath;
    }

    @JsonProperty("outMetamodelPath")
    public void setOutMetamodelPath(String outMetamodelPath) {
        this.outMetamodelPath = outMetamodelPath;
    }

}
