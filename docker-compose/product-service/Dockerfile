FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} product-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/product-service.jar"]