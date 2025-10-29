package ma.projet.cutomerservice.repository;

import ma.projet.cutomerservice.Entities.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
