// src/main/java/com/costco/repository/ProductRepository.java

package com.costco.repository;

import com.costco.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
