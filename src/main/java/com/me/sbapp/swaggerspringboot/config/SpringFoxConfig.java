package com.me.sbapp.swaggerspringboot.config;

import com.me.sbapp.swaggerspringboot.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration

public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.me.sbapp.swaggerspringboot"))
                .paths(PathSelectors.ant("/api/*"))
                .build()
                .apiInfo(getAPiInfo());
    }


        private ApiInfo getAPiInfo() {
        ApiInfo apiInfo = new ApiInfo("Spring Boot REST API",
                "Spring Boot REST API for Online Store",
                "1.0",
                "Terms of service",
               "Habtom-wmichael",
                "Apache License Version 2.0",
                "https://github.com/habtom-wmichael/Springboot-Swagger-Documentation ");
        return apiInfo;
    }


}
