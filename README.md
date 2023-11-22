# Eureka-Service-Discovery

##### In this we have 2 EUREKA SERVERS -> EurekaServerOne, EurekaServerTwo
##### In this we have 4 EUREKA CLIENTS -> EurekaServerOneClientOne, EurekaServerOneClientTwo, EurekaServerTwoClientOne, EurekaServerTwoClientTwo

## Eureka Server One
###### It runs on port 8700 and this server will be registered in EurekaServerTwo that runs on port 8800
###### EurekaServerOneClientOne, EurekaServerOneClientTwo will register with the server EurekaServerOne.

## Eureka Server Two
###### It runs on port 8800 and this server will be registered in EurekaServerOne that runs on port 8700
###### EurekaServerTwoClientOne, EurekaServerTwoClientTwo will register with the server EurekaServerTwo.
