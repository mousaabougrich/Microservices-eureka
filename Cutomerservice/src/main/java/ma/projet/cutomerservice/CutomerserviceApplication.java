package ma.projet.cutomerservice;

import ma.projet.cutomerservice.Entities.Customer;
import ma.projet.cutomerservice.repository.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CutomerserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CutomerserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner (CustomerRepo customerRepo) {
        return args -> {
            customerRepo.save(Customer.builder()
                    .name("mousaab")
                    .email("all@gmail.com").build());
            customerRepo.save(Customer.builder()
                    .name("sydny")
                    .email("all2@gmail.com").build());
            customerRepo.save(Customer.builder()
                    .name("Nadia")
                    .email("all1@gmail.com").build());
        };
    }


}
