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
