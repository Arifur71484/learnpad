FROM maven:3.5.2-jdk-8-alpine 
MAINTAINER Arifur Rahman (arifur.rahma@studenti.unicam.it)
RUN apk  update 
RUN  apk add  maven  

COPY pom.xml /usr/local/service/pom.xml
copy out /usr/local/service/out
COPY scripts /usr/local/service/scripts
COPY src /usr/local/service/src
COPY target /usr/local/service/target
COPY lp-extern-lola /usr/local/service/lp-extern-lola
COPY lp-verification-component /usr/local/service/lp-verification-component
COPY verification-component /usr/local/service/verification-component
COPY verification-component-deadlock-plugin /usr/local/service/verification-component-deadlock-plugin
COPY  verification-component-understandability-plugin /usr/local/service/verification-component-understandability-plugin
 
 
WORKDIR /usr/local/service
RUN mvn package
EXPOSE 8080
CMD ["java","-cp","lp-verification-component-1.0.jar","./out/start"]
 