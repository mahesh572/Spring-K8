FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} payment-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/payment-service.jar"]