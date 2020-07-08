FROM maven:3.5.2-jdk-8-alpine 
MAINTAINER Arifur Rahman (arifur.rahma@studenti.unicam.it)
RUN apk  update 
RUN  apk add  maven  

 
copy deployment /usr/local/service/deployment
COPY monitoring/src /usr/local/service/monitoring/src
COPY monitoring/pom.xml /usr/local/service/monitoring/pom.xml
COPY out /usr/local/service/out
COPY scripts /usr/local/service/scripts
COPY simulator /usr/local/service/simulator
 
WORKDIR /usr/local/service
RUN mvn package
EXPOSE 8080
CMD ["java","-cp","./lp-cp-xwiki-implementation/target/lp-cp-xwiki-implementation-1.0-SNAPSHOT.jar","eu.leranpad.core.impl.others.MVStubber"]

CMD ["java","-cp","./lp-cp-xwiki-implementation/target/lp-cp-xwiki-implementation-1.0-SNAPSHOT.jar","eu.learnpad.core.impl.or.tests.XwikiBridgeInterfaceRestResourceTest"]
 
CMD ["java","-cp","./lp-cp-apis/target/lp-cp-apis-1.0-SNAPSHOT.jar","eu.learnpad.or.test.KBProcessingOrAPITest"]
CMD ["java","-cp","./lp-cp-apis/target/lp-cp-apis-1.0-SNAPSHOT.jar","eu.learnpad.or.test.OrAPITest"]

