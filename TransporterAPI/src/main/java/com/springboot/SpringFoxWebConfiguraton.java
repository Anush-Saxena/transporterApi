package com.springboot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxWebConfiguraton {


	

    @Bean
    public Docket apiv1() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.groupName("api-v1")
        		.apiInfo(getInfo())
        		.select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo getInfo()
    {
		return new ApiInfo("TRANSPORTER API DOCUMENTATION","This documentaion gives the detailed explanation of all the services under Transporter Api","1.0","Terms of Service",new Contact("Liveasy","Liveasy Website","liveasy mailId"),"License Of Api","LicenSE Url", Collections.emptyList());
    	 
    }
}
