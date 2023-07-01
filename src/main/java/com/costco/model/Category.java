// src/main/java/com/costco/model/Category.java
package com.costco.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Product> products;

    @Transient
    private int productsCount;

    // getters and setters...

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public int getProductsCount() {
        return (products != null) ? products.size() : 0;
    }
}
