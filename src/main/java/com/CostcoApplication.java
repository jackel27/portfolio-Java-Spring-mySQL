package com;
// this needs to be in the same package as CostcoApplication.java
// dont forget to add the @EnableJpaRepositories annotation to CostcoApplication!!
// src/main/java/com/CostcoApplication.java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// the next line is needed to make the app work. it works like @ComponentScan.
// its similiar to javascript where you need to import a module to use it.
@EnableJpaRepositories(basePackages = "com.costco.repository")
@SpringBootApplication
public class CostcoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CostcoApplication.class, args);
    }
}
