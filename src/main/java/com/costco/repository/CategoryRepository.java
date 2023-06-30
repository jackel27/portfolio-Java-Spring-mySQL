// src/main/java/com/costco/repository/CategoryRepository.java
// this repository is used to interact with the database. its similiar to javascript where you use a model to interact with the database.
// with spring, we define a repository to interact with the database.
// folder structure is important, spring will look for the repository in the same package as the model.
package com.costco.repository;

import com.costco.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// we extend jparepository to use the methods that come with it. for instance findAll() and findById()...
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
