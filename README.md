# Inventory Management System

This is a web application designed to manage a warehouse's inventory, built with Java, Spring Boot, and Vue.js. It demonstrates an understanding of databases, ability to comprehend business needs, and developing user interfaces. The project has been created specifically for showcasing my skills for my portfolio so I can increase my chances at landing a job in the IT world. It's somewhat basic, built only for illustration purposes.

## Front-End
- Here is the front-end that will communicate with this Management System
- ```https://github.com/jackel27/Front-End_portfolio-Java-Spring-mySQL```

## Key Features
- Management of product inventory in a warehouse
- User authentication and management
- Category-based organization of products
- RESTful API to interact with the backend
- Frontend developed with Vue.js

## Technologies Used
- Backend: Java with Spring Boot
- Database: PostgreSQL
- Frontend: Vue.js
- Deployment: Docker, Digital Ocean

## Project Tree
```
portfolio
├─ 📁.vscode
│  ├─ 📄launch.json
│  └─ 📄settings.json
├─ 📁src
│  ├─ 📁main
│  │  ├─ 📁java
│  │  │  └─ 📁com
│  │  │     ├─ 📁costco
│  │  │     │  ├─ 📁config
│  │  │     │  │  └─ 📄WebConfig.java
│  │  │     │  ├─ 📁controller
│  │  │     │  │  ├─ 📄CategoryController.java
│  │  │     │  │  ├─ 📄InventoryController.java
│  │  │     │  │  ├─ 📄ProductController.java
│  │  │     │  │  └─ 📄UserController.java
│  │  │     │  ├─ 📁exception
│  │  │     │  │  └─ 📄ResourceNotFoundException.java
│  │  │     │  ├─ 📁model
│  │  │     │  │  ├─ 📄Category.java
│  │  │     │  │  ├─ 📄Inventory.java
│  │  │     │  │  ├─ 📄Product.java
│  │  │     │  │  └─ 📄User.java
│  │  │     │  ├─ 📁repository
│  │  │     │  │  ├─ 📄CategoryRepository.java
│  │  │     │  │  ├─ 📄InventoryRepository.java
│  │  │     │  │  ├─ 📄ProductRepository.java
│  │  │     │  │  └─ 📄UserRepository.java
│  │  │     │  └─ 📁service
│  │  │     │     ├─ 📄CategoryService.java
│  │  │     │     ├─ 📄InventoryService.java
│  │  │     │     ├─ 📄ProductService.java
│  │  │     │     └─ 📄UserService.java
│  │  │     └─ 📄CostcoApplication.java
│  │  └─ 📁resources
│  │     └─ 📄application.properties
│  └─ 📁test
│     └─ 📁java
│        └─ 📁com
│           └─ 📁example
│              └─ 📄AppTest.java
├─ 📁target
├─ 📄.gitignore
├─ 📄pom.xml
└─ 📄README.md
```
