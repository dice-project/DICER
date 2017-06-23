package it.polimi.dice.dicer.service;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class DicerServiceConfiguration extends Configuration {
    
    @NotEmpty
    private String transformationDir;

    @NotEmpty
    private String ddsmMetamodelPath;

    @NotEmpty
    private String diceProfilePath;
    
    @NotEmpty
    private String secureUmlProfilePath;
    
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
    
    @JsonProperty("ddsmMetamodelPath")
    public String getDdsmMetamodelPath() {
        return ddsmMetamodelPath;
    }

    @JsonProperty("ddsmMetamodelPath")
    public void setDdsmMetamodelPath(String ddsmMetamodelPath) {
        this.ddsmMetamodelPath = ddsmMetamodelPath;
    }

    @JsonProperty("diceProfilePath")
    public String getDiceProfilePath() {
        return diceProfilePath;
    }

    @JsonProperty("diceProfilePath")
    public void setDiceProfilePath(String diceProfilePath) {
        this.diceProfilePath = diceProfilePath;
    }
    
    @JsonProperty("secureUmlProfilePath")
    public String getSecureUmlProfilePath() {
        return secureUmlProfilePath;
    }

    @JsonProperty("secureUmlProfilePath")
    public void setSecureUmlProfilePath(String secureUmlProfilePath) {
        this.secureUmlProfilePath = secureUmlProfilePath;
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
