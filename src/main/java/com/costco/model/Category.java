// src/main/java/com/costco/model/Category.java
// this model is for the category model. models are used to define the structure of the data.
// similiar to javascript where you define a class to create objects. with the model you can create objects so to speak.
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

    @OneToMany(mappedBy = "category")
    private List<Product> products;
          public String getName() {
    return this.name;
}

    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
}
