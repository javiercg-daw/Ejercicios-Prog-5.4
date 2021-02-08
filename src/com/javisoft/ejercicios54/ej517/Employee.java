package com.javisoft.ejercicios54.ej517;

public class Employee {

    private String dni;
    private double salary;
    private String name;

    public Employee(String dni, double salary, String name) {
        this.dni = dni;
        this.salary = salary;
        this.name = name;
    }

    public double getPaid() {
        return salary;
    }

    public String getDni() {
        return dni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
