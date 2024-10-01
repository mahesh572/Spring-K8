# Spring-K8
Spring-microservices-Kubernates-Integration

docker build -t spring-k8/eureka:1.0.0 .
docker tag spring-k8/eureka-1.0.0:latest 8357/mahesh:latest
docker run --name spring-eureka -p 8000:8761 -d spring-k8/eureka:1.0.0 
