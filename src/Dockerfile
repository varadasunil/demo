FROM eclipse-temurin:17-jdk-alpine
LABEL MAINTAINER="varadavals"
WORKDIR /app
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","demo-0.0.1-SNAPSHOT.jar" ]