# Spring Boot with JSP

## Environment
- Java version: 1.8.0+
- Spring Boot version: 1.4.1+
- Maven 3.x+
- Default Encoding: UTF-8
- Default SCM : git
- View Template : JSP
- Layout Template : Tiles3

## Maven Dependency

``` xml
	<dependency>
		<groupId>javax.servlet</groupId>
		<artifactId>jstl</artifactId>
	</dependency>
	<dependency>
		<groupId>org.apache.tomcat.embed</groupId>
		<artifactId>tomcat-embed-jasper</artifactId>
		<scope>provided</scope>
	</dependency>
	<dependency>
        <groupId>org.apache.tiles</groupId>
        <artifactId>tiles-jsp</artifactId>
        <version>3.0.7</version>
    </dependency>
```

## application.properties

``` properties
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
```

## Run

```sh
$ spring-boot:run
```