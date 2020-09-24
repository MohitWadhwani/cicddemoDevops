FROM openjdk:8-jdk-alpine
EXPOSE 8088
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} devopsbootcamp-mohit.jar
ENTRYPOINT ["java","-jar","/devopsbootcamp-mohit.jar"]
MAINTAINER "mohitwadhwani2302@gmail.com"