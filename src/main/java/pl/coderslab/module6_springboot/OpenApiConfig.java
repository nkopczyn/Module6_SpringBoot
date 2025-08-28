package pl.coderslab.module6_springboot;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Trail API").description(
                                "This is a sample application with Spring Boot and OpenAPI")
                        .version("1.0.1"));
    }

    @Bean
    public GroupedOpenApi trailOpenApi() {
        return GroupedOpenApi
                .builder()
                .group("trail")
                .packagesToScan("pl.coderslab.module6_springboot")
                .build();
    }
}