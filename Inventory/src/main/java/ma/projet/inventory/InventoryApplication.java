package ma.projet.inventory;

import ma.projet.inventory.Repository.ProductRepo;
import ma.projet.inventory.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }
@Bean
CommandLineRunner commandLineRunner(ProductRepo  productRepo) {
        return args -> {
            productRepo.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Iphone 14")
                    .price(1000).quantity(46)

                    .build());
            productRepo.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("Iphone 13")
                    .price(100).quantity(41)

                    .build());
            productRepo.save(Product.builder()
                    .id(UUID.randomUUID().toString())
                    .name("ps 5")
                    .price(500).quantity(41)

                    .build());
            productRepo.findAll().forEach(p->
                    System.out.println(p.getName())

            );
        };
}
}
