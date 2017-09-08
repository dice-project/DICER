# DICER

DICER is a tool developed in the context of the DICE H2020 European Project enabling the model-driven deployment of data-intensive applications (DIAs) leveraging the Infrastructure-as-Code (IaC) paradigm. More specifically, DICER adopt the OASIS Topology and Orchestration Specification for Cloud Applications ([TOSCA](https://www.oasis-open.org/committees/tosca/)) standard and is able to automatically generate IaC for DIAs in the form of TOSCA blueprints from stereotypes UML models. To this aim, DICER exploits the [DICE-Profiles](https://github.com/dice-project/DICE-Profiles) applied on UML [Deployment Diagrams](http://www.uml-diagrams.org/deployment-diagrams.html) as well as the DIA-specific [TOSCA library](https://github.com/dice-project/DICE-Deployment-Cloudify), both defined and developed in the scope of the DICE project.

### Feature

* A modeling method to describe the deployment and configuration of Big Data infrastructures and DIAs by means of stereotypes UML Deployment Diagrams

* Automatic TOSCA code generation

* Support both many popular Big Data technologies

* Pre-defined UML models to simplify and speed up the design of Big Data infrastructures

* Eclipse integration (provided Eclipse plugin)

### Installation

The DICER tool runs as a service which is called via the provided Eclipse plugin, which acts as the client. In order to create DICER models you have to install the DICE-Profiles ([update site](http://dice-project.github.io/DICE-Profiles/updates)) too.
The DICER Eclipse plugin can be installed via the following Eclipse update site https://dice-project.github.io/DICER/updates. Alternatively one can directly download the [DICE-Platform](https://github.com/dice-project/DICE-Platform), an Eclipse-based IDE, which includes the DICER plugin. 
The DICER service realise the TOSCA code generation and can be deployed using the released deployment scripts.


### Creating DICER Models

The DICER tool defines a modeling method to be followed which is based on UML Deployment Diagram to be annotated with sterotypes provided by the DDSM package of the DICE-Profiles. In particular, the DDSM package provides stereotypes to model the deployment of data-intensive technologies on top of Cloud platforms and of DIAs on top of the resulting infrastructure. In the following we are going to define a sample DICER model in Eclipse Papyrus step by step with the aim of illustrating the DICER modeling method.

First, one should model the necessary Cloud resources. Data-intensive technologies are tipically distributed systems running on clusters of nodes (virtual machines or containers). To model such aspect it is possible to use the DdsmVMsCluster stereotype to be applied on a UML Device element. 


Data-intensive technologies are then just software platforms running on the available clusters in a distributed fashion. Some of them are responsible to actually executing DIAs and are called execution engines. The DDSM package of the DICE-Profiles provides specific stereotypes for the various supported technologies (such as Spark, Storm or Cassandra). Such stereotypes have to be applied on UML Node elements that are placed within the previously instantiated DdsmVMsCluster Devices. Execution engines, e.g. Spark or Storm, should be model as UML ExecutionEnvironment with applied the corresponding stereotype.

Finally DIA running on top of the resulting infrastructure can be represented as UML Artifacts annotated with the DdsmBigDataJob stereotype with a UML Deployment Dependency connecting them to the ExecutionEnvironment which is supposed to execute them. If a DIA needs other data-intensive platforms in order to operate, a UML Dependency can be used to model such aspect.

All the provided stereotypes provide attributes to configure each data-intensive platform as well as the way DIAs are deployed.

### Generating TOSCA Bleuprints using the DICER plugin

Once a valid DICER model has been built, the corresponding TOSCA blueprint can be obtained by calling the DICER service (which must be run in advance to serve as the backend) via the provided Eclipse plugin. The plugin provides a simple Eclipse Run Configuration to contact the DICER service and get back the generated blueprint.