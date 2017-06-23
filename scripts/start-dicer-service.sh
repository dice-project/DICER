export TRANSFORMATION_DIR=${DICER_HOME}/DICER/dicer-core/transformations/
export DDSM_METAMODEL_PATH=${DICER_HOME}/DICER/dicer-core/metamodels/ddsm.ecore
export DICE_PROFILE_PATH=${DICER_HOME}/DICER/dicer-core/metamodels/DICE.profile.uml
export SECUREUML_PROFILE_PATH=${DICER_HOME}/DICER/dicer-core/metamodels/SecureUML.profile.uml
export OUT_METAMODEL_PATH=${DICER_HOME}/DICER/dicer-core/metamodels/tosca.ecore

cd ${DICER_HOME}/DICER/dicer-service/target/
nohup java -jar dicer-service-0.2.0.jar server ../config.yaml > dicer-service.log 2>&1 & echo $! > PID.pid
