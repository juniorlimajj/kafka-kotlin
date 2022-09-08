# Kafka + Kotlin

[![Build Status](https://travis-ci.org/juniorlimajj/kafka-kotlin.svg?branch=master)](https://travis-ci.org/juniorlimajj/kafka-kotlin)

Simple implementation of Kafka using Kotlin and Spring Boot.


Requirements:
- 
 - Java 8 or higher
 - Docker and Docker Compose

Cloning and running the project:
-
 - ``git clone https://github.com/juniorlimajj/kafka-kotlin.git``
 - ``cd kafka-kotlin``
 - ``docker-compose up -d``
 - ``mvn spring-boot:run``

Sending a message:
-
 - ``curl --location --request POST 'http://localhost:8081/kafka/publish?message=message'``

Reference:
- 
 - https://www.confluent.io/blog/apache-kafka-spring-boot-application/