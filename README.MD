# Spring Boot with JSP

## Environment
- Java version: 1.8.0+
- Spring Boot version: 1.4.1+
- Maven 3.x+
- Default Encoding: UTF-8
- Default SCM : git
- View Template : JSP
- Layout Template Framework : Tiles3
- Template : [SB Admin 2](https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/index.html)

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

## Tiles Configuration

``` java
package com.jason.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * @author jason, Moon
 * @since 2016-10-20
 */
@Configuration
public class TilesConfig {

    private String[] tilesConfigDefinitions = {
            "/WEB-INF/tiles/tiles.xml"
    };

    @Bean
    public TilesConfigurer tilesConfigurer() {

        final TilesConfigurer configurer = new TilesConfigurer();

        configurer.setDefinitions(tilesConfigDefinitions);
        configurer.setCheckRefresh(true);

        return configurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {

        final TilesViewResolver viewResolver = new TilesViewResolver();

        viewResolver.setViewClass(TilesView.class);

        return viewResolver;
    }
}
```

## Run

```sh
$ spring-boot:run
```