export DICER_HOME=/home/ubuntu

cd ${DICER_HOME}

git clone https://github.com/dice-project/DICER
cd ${DICER_HOME}/DICER/dicer-core/src

mvn install:install-file -Dfile=../lib/com.masdes.dam.static.profile_0.11.0.201703021727.jar -DgroupId=com.masdes.dam.static \
    -DartifactId=profile -Dversion=0.11.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/es.unizar.disco.dice.static.profile_0.12.6.201709120918.jar -DgroupId=es.unizar.disco.dice.static \
    -DartifactId=profile -Dversion=0.12.6 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.emf.mapping.ecore2xml_2.9.0.v20160526-0356.jar -DgroupId=org.eclipse.emf.mapping \
    -DartifactId=ecore2xml -Dversion=2.9.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.ocl_3.6.0.v20160523-1914.jar -DgroupId=org.eclipse \
    -DartifactId=ocl -Dversion=3.6.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.papyrus.marte.static.profile_1.2.0.201612071122.jar -DgroupId=org.eclipse.papyrus.marte.static \
    -DartifactId=profile -Dversion=1.2.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.uml2.common_2.1.0.v20161114-0827.jar -DgroupId=org.eclipse.uml2 \
    -DartifactId=common -Dversion=2.1.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.uml2.types_2.0.0.v20161114-0827.jar -DgroupId=org.eclipse.uml2 \
    -DartifactId=types -Dversion=2.0.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.uml2.uml_5.2.2.v20161114-0827.jar -DgroupId=org.eclipse.uml2 \
    -DartifactId=umlmodel -Dversion=5.2.2 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.uml2.uml.profile.standard_1.0.100.v20161114-0827.jar -DgroupId=org.eclipse.uml2.uml.profile \
    -DartifactId=standard -Dversion=1.0.100 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/org.eclipse.uml2.uml.resources_5.2.0.v20161114-0827.jar -DgroupId=org.eclipse.uml2.uml \
    -DartifactId=resources -Dversion=5.2.0 -Dpackaging=jar

mvn install:install-file -Dfile=../lib/ro.ieat.secureuml.profile_0.11.0.201703021727.jar -DgroupId=ro.ieat.secureuml \
    -DartifactId=profile -Dversion=0.11.0 -Dpackaging=jar

cd ${DICER_HOME}/DICER
mvn clean package
