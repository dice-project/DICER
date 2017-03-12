package it.polimi.dice.dicer.service;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DicerServiceLauncher extends Application<DicerServiceConfiguration> {

    public static void main(String[] args) throws Exception {

        new DicerServiceLauncher().run(args);

    }

    @Override
    public void initialize(Bootstrap<DicerServiceConfiguration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new SubstitutingSourceProvider(
                bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)));
    }

    @Override
    public void run(DicerServiceConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new DicerService(configuration.getTransformationDir(),
                configuration.getDdsmMetamodelPath(), configuration.getDiceProfilePath(), configuration.getOutMetamodelPath()));

    }
}
