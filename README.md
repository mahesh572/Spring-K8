# Spring-K8
Spring-microservices-Kubernates-Integration

docker login

docker logout

docker build -t 8357/spring-k8-eureka .

docker push 8357/spring-k8-eureka

docker build -t spring-k8-eureka .
docker tag imagename username/imagename:version

docker tag spring-k8-eureka 8357/spring-k8-eureka:1.0.0

8357 is a username of the docker hub.

docker push 8357/spring-k8-eureka:1.0.0

docker run --name spring-eureka -p 8000:8761 -d 8357/spring-k8-eureka:1.0.0 


Installing Mysql Container:
------------------------------

docker pull mysql

docker run -p 3305:3306 --name mysql-container -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test mysql

docker exec -it mysql-container bash

mysql -u root -p root

show databases;

 create database productdb;
