//package com.ecommerce.OnlineStore.config;
//
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.ExternalDocumentation;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//import org.springdoc.core.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//    @Bean
//    public OpenAPI springShopOpenAPI() {
//        return new OpenAPI()
//                .components(new Components()
//                        .addSecuritySchemes("Token",
//                                new SecurityScheme()
//                                        .type(SecurityScheme.Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT"))
//                )
//                .info(new Info().title("Vehicle Management System API")
//                        .description("Vehicle Management System API")
//                        .version("v1")
//                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
//                )
//                .externalDocs(new ExternalDocumentation()
//                        .description("Vehicle Management System Wiki Documentation")
//                        .url("https://vms.wiki.github.org/docs")
//                );
//    }
//
//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("vms-client")
//                .pathsToMatch("/category/**")
//                .build();
//    }
//}