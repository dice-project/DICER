# DICER

DICER is a tool developed in the context of the DICE H2020 European Project with the goal of supporting the deployment and management of Big Data applications. 
Main goal of DICER is to exploit deployment models specified in accordance with the DICE Deployment Specific metamodel, in order to speed up the deployment process and to avoid the lock-in with specific deployment engines. 
DICER is still at its early stage and right now the only supported deployment engine is the DICE Deployment Service, based on Cloudify. We plan to support other orchestration engines in the next releases. 

# Requirement

DICER leverages the DICE Deployment Specific Metamodel (DDSM), which can be directly used to create DICER-processable models. The metamodel is included in the DICER project. Right now DICER does not provide its own GUI and operates as a simple java tool, runnable from the command line. The same apply for the creation of the input models, which can be created directly from the DDSM using the ecore reflective diagram editor. The eclipse Reflective Ecore Model Diagram Editor is available at the following url:

http://dynamicgmf.sourceforge.net

In order to install it, after downloading, it is sufficient to copy and paste the .jar plugin file into your eclipse installation's plugin folder. 

It requires GMF 2.0 or higher and EMF installed. 

Finally, once you have installed the Ecore Model Diagram Editor plugin into your eclipse installation, you just have to checkout the DICER project and to import it in Eclipse.

# Installation

In order to user DICER you can either download one of the available releases, or directly compile the source code. 
In the case you download the from one of the gihtub [releases](https://github.com/DICERs/DICER/releases), you can find all you need to start using DICER in the available dicer-full.zip binary. Here is the content of the dicer-full.zip artifact:

	tree dicer-full/
	dicer-full/
	├── dicer-core-0.1.0.jar
	├── metamodels
	│   ├── ddsm.ecore
	│   ├── ddsm.ecore.oclas
	│   ├── tosca.ecore
	│   └── tosca.genmodel
	├── models
	│   ├── storm_cluster.xmi
	│   ├── storm_cluster.xmi_diagram
	│   ├── storm_deployment.xmi
	│   └── storm_deployment.xmi_diagram
	└── transformations
	    ├── ddsm2tosca.asm
	    ├── ddsm2tosca.atl
	    └── ddsm2tosca.emftvm

	3 directories, 12 files

It contains the required Ecore metamodels, the ATL transformation and the java artifact running the DICER as a whole. Moreover some examples are released under the models/ folder to try using the DICER. Each of these component of the dicer-full.zip artifact is also released separately. By using the release the installation phase ends with the download of the dicer-full.zip artifact itseld.
In order to create more input models right now you can leverage the dynamicgmf Eclipse plugin, as described in the requirement section.

In the case you want to checout and compile the source code you can compile the DICER with maven. :
Make sure to put the compiled artifact in the same folder in which the metamodels/ and transformations/ folders are located ( the root folder in the case you checkout the source code). You may using the following commands:

    git clone https://github.com/DICERs/DICER.git
    cd DICER
    mvn clean package
    cd dicer-core
    cp dicer-core/target/dicer-core-0.1.0.jar .

# Usage

In order to run DICER, assuming that you already created a DDSM model using the provided metamodel and with the help of the Ecore Reflective Diagram Editor, you just need to run compiler .jar artifact giving as input the path to the input DDSM model and the path to the output TOSCA models. In order to run DICER against one o the available models you can execute following command:

    java -jar dicer-core-0.1.0.jar -inModel models/storm_cluster.xmi -outModel models/storm_cluster_tosca

Make sure that the -outModel argument is a path to a file with no extention. DICER will create also an xmi and a json version of the generated deployment blueprint.

	