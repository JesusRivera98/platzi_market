# platzi_market
This repo is from Platzi's course [Java Spring](https://platzi.com/clases/java-spring/)

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info

In this course we learn how to implement Spring in Java to create a web application and also how to deploy this using Heroku.
Throughout the course we were developing the web service that in the end we deployed on a [web page](https://platzimarketjrf.herokuapp.com/platzi-market/api/)

Spring is the most used Java framework. It offers us tools that allow us to create more advanced projects, with better practices and in less time. It also has a great community, which gives us a lot of documentation and help.

Spring has a modular and flexible structure, which makes us use only what we need.

### Spring subprojects:

|Name|Description|
|----|-----------|
|Spring Framework| Allows you to create business applications. It is transversal, since everyone uses it.|
|Spring Boot| With which we can create self-contained and self-configuring applications.|
|Spring Data| Manage and integrate databases.|
|Spring Security| Manage application security.|

### JPA implementations
||
|-|
|Hibernate|
|EclipseLink|
|TopLink|
|ObjectBD|

### JPA annotations

|Annotation|Description|
|----------|-----------|
|@Entity.| It indicates to a java class that it is representing a table in our database.|
|@Table.| It receives the name of the table to which the class is mapping.|
|@column.| It is put to the attributes of the class, it is not mandatory, it is indicated only when the name of the column is different from the name of the attribute of the table.|
|@id amd @EmbededID.| It is the attribute as the primary key of the table within the class. @id is used when it is a simple primary key and @EmbededID when it is a composite primary key.|
|@GeneratedValue.| It allows to automatically generate values for the primary classes in our classes|
|@OneToMany and @MatyToOne.| Represent relationships|

### Mapping annotations

|Annotation|Use|
|----------|---|
|@GetMapping| Receive|
|@PostMapping| Submit|
|@DeleteMapping| Delete|

## Technologies

This project was created using:
* Java
* IntelliJ IDEA
* Postman
* PostgresSQL
* OpenJDK 11
* [Spring](https://start.spring.io/)
* [Herolu](https://www.heroku.com/)

## Setup

To work in this project, install it locally:
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download)
* [Postman](https://www.postman.com/downloads/)
* [PostgresSQL](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads)
* [OpenJDK 11](https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot)
* [Java](https://www.java.com/es/download/manual.jsp) 11 or higher

To create the database you can use these scripts:
* [Schema](https://drive.google.com/file/d/1DZTGB-BC3LqoZLN_UK8uyt4_eZP-MfBl/view)
* [Data](https://drive.google.com/file/d/1MhNMwcxSvRYNfA8H3NjOtixSPM6Ovwaa/view)

