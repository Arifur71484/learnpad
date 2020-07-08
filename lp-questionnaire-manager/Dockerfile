FROM maven:3.5.2-jdk-8-alpine 
MAINTAINER Arifur Rahman (arifur.rahma@studenti.unicam.it)
RUN apk  update 
RUN  apk add  maven  

COPY pom.xml /usr/local/service/pom.xml
COPY out /usr/local/service/out
COPY scripts /usr/local/service/scripts
COPY src /usr/local/service/src
COPY target /usr/local/service/target

WORKDIR /usr/local/service
 
EXPOSE 8080
CMD ["java","-cp","lp-questonnaire-manager-1.0-SNAPSHOT.jar","./out/start"]
 