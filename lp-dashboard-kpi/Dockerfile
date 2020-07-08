FROM maven:3.5.2-jdk-8-alpine 
MAINTAINER Arifur Rahman (arifur.rahma@studenti.unicam.it)
RUN apk  update 
RUN  apk add  maven  

COPY pom.xml /usr/local/service/pom.xml
copy lp-dash-adoxx-cockpit /usr/local/service/lp-dash-adoxx-cockpit
COPY lp-dash-bridge /usr/local/service/lp-dash-bridge
COPY out /usr/local/service/out
COPY src /usr/local/service/src
COPY scripts /usr/local/service/scripts

WORKDIR /usr/local/service
RUN mvn package
EXPOSE 8080
CMD ["java","-cp","lp-dash-bridge-1.0-SNAPSHOT.jar","./out/start"]
 