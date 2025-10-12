package com.employeeapp;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scannner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while( true ) {
           System.out.println("\n ====== Employee Management System =====");
           System.out.println("1. Add Employee");
           System.out.println("2. View All Employees");
           System.out.println("3. Update Employee Salary");
           System.out.println("4. Delete Employee ");
           System.out.println("5. Exit ");
           System.out.print("Enter your choice: ");
           int choice = sc.nextInt();

         switch(choice){
           case 1:
             System.out.println("Enter Name: ");
             String name = sc.next();
             System.out.println("Enter City: ");
             String name = sc.next();
             System.out.println("Enter Salary: ");
             double salary = sc.nextDouble();
             dao.addEmployee(new Employee(0, name, city, salary));
             break;

           case 2:
              dao.getAllEmployees();
              break;

           case 3:
             System.out.print("Enter Employee ID: ");
             int id = sc.nextInt();
             System.out.println("Enter New Salary: ");
             double newSalary = sc.nextDouble();
             dao.updateEmployee(id, newSalary);
             break;

           case 4:
            System.out.print("Enter Employee ID: ");
            int delId = sc.nextInt();
            dao.deleteEmployee(delId);
            break;

           case 5:
             System.out.println("Exiting... ");
             System.exit(0);

           default:
              System.out.println(" Invalid choice!");
         }
        }
    }
}
