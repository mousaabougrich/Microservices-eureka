package ma.projet.inventory.config;


import ma.projet.inventory.entities.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "all", types = {Product.class})
public interface CustomerProjection {
    String GetName();
    String GetEmail();
}
