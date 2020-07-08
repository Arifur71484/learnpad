FROM maven:3.5.2-jdk-8-alpine 
MAINTAINER Arifur Rahman (arifur.rahma@studenti.unicam.it)
RUN apk  update 
RUN  apk add  maven  

COPY pom.xml /usr/local/service/pom.xml
copy lp-cp-apis/pom.xml /usr/local/service/lp-cp-apis/pom.xml
COPY lp-cp-conf/pom.xml /usr/local/service/lp-cp-conf/pom.xml
COPY lp-cp-xwiki-implementation/pom.xml /usr/local/service/lp-cp-xwiki-implementation/pom.xml
COPY lp-cp-xwiki-implementation/src /usr/local/service/lp-cp-xwiki-implementation/src
COPY lp-cp-conf/src /usr/local/service/lp-cp-conf/src
COPY lp-cp-apis/src /usr/local/service/lp-cp-apis/src
WORKDIR /usr/local/service
RUN mvn package
EXPOSE 8080
CMD ["java","-cp","./lp-cp-xwiki-implementation/target/lp-cp-xwiki-implementation-1.0-SNAPSHOT.jar","eu.leranpad.core.impl.others.MVStubber"]

CMD ["java","-cp","./lp-cp-xwiki-implementation/target/lp-cp-xwiki-implementation-1.0-SNAPSHOT.jar","eu.learnpad.core.impl.or.tests.XwikiBridgeInterfaceRestResourceTest"]
 
CMD ["java","-cp","./lp-cp-apis/target/lp-cp-apis-1.0-SNAPSHOT.jar","eu.learnpad.or.test.KBProcessingOrAPITest"]
CMD ["java","-cp","./lp-cp-apis/target/lp-cp-apis-1.0-SNAPSHOT.jar","eu.learnpad.or.test.OrAPITest"]



