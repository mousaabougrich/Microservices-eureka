package ma.projet.gatwayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class GatwayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatwayServiceApplication.class, args);
    }
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder rlb) {
//        return rlb.routes()
//                .route("r1", r -> r
//                        .path("/api/customers/**")
//                        .uri("http://localhost:8081"))
//                .route("r2", r -> r
//                        .path("/api/products/**")
//                        .uri("http://localhost:8082"))
//                .build();
//    }

    @Bean
    DiscoveryClientRouteDefinitionLocator Locator(ReactiveDiscoveryClient client, DiscoveryLocatorProperties properties) {
        return new DiscoveryClientRouteDefinitionLocator(client, properties);
    }
}
