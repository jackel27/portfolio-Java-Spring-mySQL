// src/main/java/com/costco/service/ProductService.java

package com.costco.service;

import com.costco.exception.ResourceNotFoundException;
import com.costco.model.Category;
import com.costco.model.Product;
import com.costco.repository.ProductRepository;
import com.costco.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository; // Inject the CategoryRepository

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        if (product.getCategoryId() != null) {
            Category category = categoryRepository.findById(product.getCategoryId())
                .orElseThrow(() -> new ResourceNotFoundException("Category not found"));
            product.setCategory(category);
        }
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product productDetails){
        Product product = productRepository.findById(id).orElse(null);
        if (product != null) {
            product.setName(productDetails.getName());
            product.setDescription(productDetails.getDescription());
            product.setPrice(productDetails.getPrice());
            if (productDetails.getCategoryId() != null) {
                Category category = categoryRepository.findById(productDetails.getCategoryId())
                    .orElseThrow(() -> new ResourceNotFoundException("Category not found"));
                product.setCategory(category);
            }
            return productRepository.save(product);
        } else {
            return null;
        }
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
