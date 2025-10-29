package ma.projet.cutomerservice.config;

import ma.projet.cutomerservice.Entities.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = {Customer.class})
public interface CustomerProjection {
    String GetName();
    String GetEmail();
}
