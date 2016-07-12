# DICER

DICER is a tool developed in the context of the DICE H2020 European Project with the goal of supporting the deployment and management of Big Data applications. 
Main goal of DICER is to exploit deployment models specified in accordance with the DICE Deployment Specific metamodel, in order to speed up the deployment process and to avoid the lock-in with specific deployment engines. 
DICER is still at its early stage and right now the only supported deployment engine is the DICE Deployment Service, based on Cloudify. We plan to support other orchestration engines in the next releases. 

# Requirement

DICER leverages the DICE Deployment Specific Metamodel (DDSM), which can be directly used to create DICER-processable models. The metamodel is included in the DICER project. Right now DICER does not provide its own GUI and operates as a simple java tool, runnable from the command line. The same apply for the creation of the input models, which can be created directly from the DDSM using the ecore reflective diagram editor. Once you have installed the ecore reflective diagram editor plugin into your eclipse installation, you just have to checkout the DICER project, import in Eclipse and create a new Reflective Ecore Model Diagram, specifying the metamodels/ddsm.ecore metamodel as the ecore model to use. Once you created your deployment specific model in Eclipse using the Reflective Ecore Diagram Plugin and the porvided DDSM metamodel, you can run the DICER tool to obtain a blueprint deployable with the DICE Deployment Service. Since the DICE Deployment Service leverages Cloudify, the output will be a TOSCA blueprint.

# Installation

In order to user DICER you can either donwload one of the released binary, or directly compile the source code. In this second case you need maven installed and then you can just execute the following commands:

git clone http://dice.git
cd DICER
mvn clean package

Make sure to put the compiled artifact in the same folder in which the metamodels/ and transformations/ folders are located ( the root folder in the case you checkout the source code).

# Usage

In order to run DICER, assuming that you already created a DDSM model using the provided metamodel and with the help of the Ecore Reflective Diagram Editor, you just need to run the following command:

java -jar dicer.jar -inModel path/to/ddsm_model.xmi -outModel path/to/output_model

Make sure that the -outModel argument is a path to a file with no extention. DICER will create also an xmi and a json version of the generated deployment blueprint.