FROM maven:3.5.2-jdk-8-alpine 
MAINTAINER Arifur Rahman (arifur.rahma@studenti.unicam.it)
RUN apk  update 
RUN  apk add  maven  

COPY  pom.xml /usr/local/service/pom.xml
COPY  src /usr/local/service/src
copy  lp-ca-ui/pom.xml /usr/local/service/lp-ca-ui/pom.xml
COPY  lp-ca-ui/src /usr/local/service/lp-ca-ui/src
COPY  out /usr/local/service/out
COPY  scripts /usr/local/service/scripts
COPY  target /usr/local/service/target
COPY  utils /usr/local/service/utils
COPY  .settings /usr/local/service/.settings
COPY  WEB-INF /usr/local/service/WEB-INF
COPY  lib /usr/local/service/lib

 
WORKDIR /usr/local/service
 
EXPOSE 8080
CMD ["java","-cp","target/lp-content-analysis.jar","eu.learnpad.ca.main.Main"]

 


