package com.employeeapp;

public class Employee {
    private int id;
    private String name;
    private String city;
    private double salary;

    public Employee(int id, String name, String city, double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public double getSalary() { return salary; }
}
