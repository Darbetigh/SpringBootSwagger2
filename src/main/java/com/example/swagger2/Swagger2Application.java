package com.example.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:8080/swagger-ui.html

@SpringBootApplication
@EnableSwagger2
public class Swagger2Application {

    public static void main(String[] args) {

        SpringApplication.run(Swagger2Application.class, args);
    }

    //Spring Boot uygulamanız için Swagger2’yi yapılandırmak üzere Docket Bean’i oluşturun

}

