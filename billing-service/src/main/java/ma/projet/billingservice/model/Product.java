package ma.projet.billingservice.model;

import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
