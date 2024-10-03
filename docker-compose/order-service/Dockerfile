FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} order-service.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/order-service.jar"]