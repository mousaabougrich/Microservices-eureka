package ma.projet.cutomerservice.Entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = {Customer.class})
public interface CustomerProjection {
    String GetName();
    String GetEmail();
}
