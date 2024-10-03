# Spring-K8
Spring-microservices-Kubernates-Integration

Micro-servisec are needed to communicate with another microservices to meet the requirement so that, all the microservices application containers should be in the same Network.

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

docker run -p 3305:3306 --name mysql-container -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test -d mysql 

docker exec -it mysql-container bash

mysql -u root -p root

show databases;

 create database productdb;

 * we may get build errors while maven build due to mysql hostname port dynamically being provided by environment variables.
 * due to that error , we need to skipt test
 * mvn clean install -Dskiptests

   For Every Module follow below steps.
   -----------------------------------------

   mvn clean install -Dskiptests

   docker build -t spring-k8-eureka:1.0.0 .
   
   docker tag spring-k8-eureka:1.0.0 8357/spring-k8-eureka:1.0.0

   docker push 8357/spring-k8-eureka:1.0.0

   creating Docker Containers and Deploying into Docker
   --------------------------------------------------------

   docker network ls

   docker network create spring-network

   docker network connect spring-network order-service

   docker inspect order-service  (order-service : container name)

   if we want to see all the configuarations related to the particular netwotk and what are the containaers are attached to this network , hit the below command

   docker inspect network spring-network

   docker run -it -p 8080:8080 --name product-service --net spring-network -e MYSQL_HOST=mysql -e MYSQL_PORT=3306 -e MYSQL_USER=root -e MYSQL_PASSWORD=root -d 8357/product-service:1.0.0

docker run -it -p 8081:8081 --name payment-service --net spring-network -e MYSQL_HOST=mysql -e MYSQL_PORT=3306 -e MYSQL_USER=root -e MYSQL_PASSWORD=root -d 8357/payment-service:1.0.0

docker run -it -p 8082:8082 --name order-service --net spring-network -e MYSQL_HOST=mysql -e MYSQL_PORT=3306 -e MYSQL_USER=root -e MYSQL_PASSWORD=root -d 8357/order-service:1.0.0
   
   
