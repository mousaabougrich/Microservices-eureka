package ma.projet.billingservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.projet.billingservice.model.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data@NoArgsConstructor@AllArgsConstructor@Builder
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    private  Long customerId;
    @OneToMany(mappedBy = "bill")
    private List<Productiteam> productiteams = new ArrayList<>();
    @Transient
    //exist dons class mais pas relation avec DB
    private Customer customer;

}
