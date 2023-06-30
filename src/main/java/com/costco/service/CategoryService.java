// src/main/java/com/costco/service/CategoryService.java
// the category service is used to handle the business logic. for instance, if you want to create a new category, you would do it here.
// the service is different from the the repository because the repository is used to interact with the database where as the service is used to handle the business logic.
// handling the business logic in the service is a good practice because it keeps the code clean and organized.
package com.costco.service;

import com.costco.model.Category;
import com.costco.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category updateCategory(Long id, Category categoryDetails){
        Category category = categoryRepository.findById(id).orElse(null);
        if (category != null) {
            category.setName(categoryDetails.getName());
            return categoryRepository.save(category);
        } else {
            return null;
        }
    }

    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }
}
