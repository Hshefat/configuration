# configuration-micro
Date: 31-01-2023 
Microservices 





















Eureka server: 

Then have to use enable eureka annotation 



Then make a yml file

eureka:
 instance:
   hostname: localhost
 client:
   register-with-eureka: false
   fetch-registry: false
server:
 port: 8761




Configuration services:


server:
 port: 8085
spring:
 application:
   name: CONFIG-SERVER
  







GITHUB= CONFIG



















To add services into eureka server we have to add this into yml file

server:
 port: 8089


spring:
 application:
   name: MANAGEMENT
 datasource:
   driverClassName: org.postgresql.Driver
   url: jdbc:postgresql://localhost:5432/micro
   username: postgres
   password: root
 jpa:
   hibernate:
     ddl-auto: update
   show-sql: true
   properties:
     hibernate:
       dialect: org.hibernate.dialect.PostgreSQLDialect
 config:
   import: optional:configserver:http://localhost:8085/














This is for github file code


# spring:




#   application:


#     name: CONFIG-GITHUB


eureka:


 instance:


   prefer-ip-address: true


 client:


   fetch-registry: true


   register-with-eureka: true


   service-url:


     defaultZone: http://localhost:8761/eureka





==============================================================

For StoreIn services:


========================================================================



server:
 port: 8086


spring:
 application:
   name: STORE-IN-SERVICE
 datasource:
   driverClassName: org.postgresql.Driver
   url: jdbc:postgresql://localhost:5432/micro
   username: postgres
   password: root
 jpa:
   hibernate:
     ddl-auto: update
   show-sql: true
   properties:
     hibernate:
       dialect: org.hibernate.dialect.PostgreSQLDialect
 config:
   import: optional:configserver:http://localhost:8085/ 





