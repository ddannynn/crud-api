FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} crud-api-0.0.1.jar
ENTRYPOINT ["java","-jar","/crud-api-0.0.1.jar"]