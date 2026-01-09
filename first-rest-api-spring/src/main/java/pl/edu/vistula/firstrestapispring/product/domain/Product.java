package pl.edu.vistula.firstrestapispring.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Product {
    private Long id;
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
