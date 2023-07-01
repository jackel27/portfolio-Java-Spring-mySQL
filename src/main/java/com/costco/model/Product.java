// src/main/java/com/costco/model/Product.java

package com.costco.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;

    @ManyToOne
    @JsonIgnore
    private Category category;

    @Transient // This means it won't be persisted in the database
    @JsonProperty("categoryId") // This means it will be included in the JSON
    private Long categoryId;

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    // Getters
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public Double getPrice() {
        return this.price;
    }
    public Category getCategory() {
        return this.category;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }
}
