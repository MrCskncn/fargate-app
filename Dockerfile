FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} aws_test_backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/aws_test_backend-0.0.1-SNAPSHOT.jar"]