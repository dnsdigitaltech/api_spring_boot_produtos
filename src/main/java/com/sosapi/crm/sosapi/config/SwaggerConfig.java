package com.sosapi.crm.sosapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
    @Bean
    public Docket produtoApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sosapi.crm.sosapi"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
            "Produto API REST", 
            "API REST de cadastro de produtos.", 
            "1.0", 
            "Termo de Serviços", 
            new Contact("Davi Bernardo", "https://github.com/dnsdigitaltech/", "dnssites@gmail.com"), 
            "Apache License Vesion 2.0", 
            "https://www.apache.org/licenses/LICENSE-2.0", 
            new ArrayList<VendorExtension>()
        );

        return apiInfo;
    }

}
