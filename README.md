# Merchant Product Management System Using Hibernate ORM

## 📌 Project Overview

The **Merchant Product Management System** is a Java-based console application developed using **Hibernate ORM** and **MySQL** database. This project is designed to manage merchant records and product details in a structured and efficient way.

In many businesses, merchant and product records are still maintained manually using notebooks, Excel sheets, or paper files. This process is slow, error-prone, and difficult to maintain when the amount of data grows.

To solve this problem, this project provides a digital management system where merchants can register themselves, log in securely, add products, update records, and search product information quickly.

This project demonstrates practical implementation of:

- Java Programming
- Hibernate ORM Framework
- MySQL Database
- One-to-Many Mapping
- CRUD Operations
- Console-Based Application Development

---

# 🎯 Problem Statement

Small and medium businesses often face many challenges while managing merchant and product information manually.

Some common problems are:

- Duplicate records
- Missing data
- Difficult searching process
- Time-consuming updates
- Poor security of passwords
- Manual paperwork
- Lack of centralized system

When the number of merchants and products increases, manual systems become inefficient.

Therefore, a computerized system is required to:

- Store merchant data securely
- Manage products efficiently
- Provide quick search functionality
- Verify merchant login credentials
- Reduce paperwork
- Improve business productivity

---

# 🎯 Objectives of the Project

The main objectives of this project are:

1. To develop a computerized merchant and product management system.
2. To store merchant details securely in MySQL database.
3. To add, update, and retrieve product information.
4. To verify merchant login credentials securely.
5. To provide search features by:
   - Merchant ID
   - Brand Name
   - Category
6. To reduce human errors.
7. To improve speed and accuracy.
8. To understand Java + Hibernate integration practically.

---

# 🛠️ Technologies Used

## 1️⃣ Java

Java is the main programming language used in this project.

### Why Java?

- Object Oriented Programming
- Platform Independent
- Secure
- Easy Database Connectivity
- Large Community Support

Java is used to create:

- Entity Classes
- DAO Classes
- Controller Classes

---

## 2️⃣ Hibernate ORM

Hibernate is an ORM (Object Relational Mapping) framework.

It maps Java classes directly to database tables.

### Advantages:

- No need to write SQL queries manually
- Easy CRUD operations
- Automatic table creation
- Relationship Mapping
- Better maintainability

---

## 3️⃣ MySQL

MySQL is used as relational database to store project data permanently.

### Stores:

- Merchant Details
- Product Details

---

## 4️⃣ JDBC

Hibernate internally uses JDBC to connect Java with MySQL.

---

## 5️⃣ Maven

Maven is used for dependency management.

Libraries used:

- Hibernate Core
- MySQL Connector
- JPA API

---

# 🏗️ Project Modules

The project contains two major modules:

---

# 👤 Merchant Module

Used for merchant operations.

### Features:

- Register Merchant
- Update Merchant
- Find Merchant by ID
- Verify Login using Email + Password
- Verify Login using Phone + Password

### Merchant Details Stored:

- ID
- Name
- Phone Number
- GST Number
- Email
- Password

---

# 📦 Product Module

Used for product management.

### Features:

- Add Product
- Update Product
- Find Products by Merchant ID
- Search Products by Brand
- Search Products by Category

### Product Details Stored:

- Product ID
- Product Name
- Brand
- Category
- Cost
- Merchant ID

---

# 🔗 Relationship Mapping

This project uses:

## One-To-Many Relationship

### Meaning:

- One Merchant can own many Products
- One Product belongs to only one Merchant

### Example:

Merchant Rahul owns:

- Laptop
- Mouse
- Keyboard

---

# 🗂️ Project Structure

```bash
MerchantProductManagementSystem
│── src/main/java
│   ├── dto
│   │   ├── Merchant.java
│   │   └── Product.java
│   │
│   ├── dao
│   │   ├── MerchantDao.java
│   │   └── ProductDao.java
│   │
│   └── controller
│       └── MerchantProductController.java
│
│── src/main/resources
│   ├── hibernate.cfg.xml
│   └── persistence.xml
│
│── pom.xml
