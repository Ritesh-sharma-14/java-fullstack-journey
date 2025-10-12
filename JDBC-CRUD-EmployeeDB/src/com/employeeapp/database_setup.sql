CREATE DATABASE employee_db;
USE employee_db;

CREATE TABLE employees{
   id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(100),
   city VARCHAR(100),
   salary DOUBLE
  );
