package ma.projet.inventory.Repository;

import ma.projet.inventory.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface ProductRepo extends CrudRepository<Product,String> {

}
