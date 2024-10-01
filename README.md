# Spring-K8
Spring-microservices-Kubernates-Integration

docker build -t 8357/eureka:1.0.0 .

8357 is a username of the docker hub.
docker build -t 8357/spring-k8-eureka .
docker push 8357/spring-k8-eureka

optional below:
-------------------------
docker tag spring-k8/eureka-1.0.0:latest 8357/mahesh:latest
docker run --name spring-eureka -p 8000:8761 -d spring-k8/eureka:1.0.0 
