package ma.projet.billingservice.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.projet.billingservice.model.Product;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@Builder
public class Productiteam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ProductId;
    @ManyToOne
    private Bill bill;
    private int quantity;
    private double price;
    @Transient
    private Product product;


}
