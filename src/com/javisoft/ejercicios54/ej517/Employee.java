package com.javisoft.ejercicios54.ej517;

public class Employee {

    private String dni;
    private double salary;
    private String name;

    public Employee(String dni, double salary, String name) throws IllegalArgumentException {
        if (!isValidDNI(dni)) {
            throw new IllegalArgumentException("Invalid DNI number.");
        }
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

    private static boolean isValidDNI(String dni) {
        final char[] DNI_LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
                'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return dni.matches("\\d{8}[a-zA-Z]") && dni.length() == 9 && dni.toUpperCase().charAt(8) == DNI_LETTERS[Integer.parseInt(dni.substring(0, 8)) % 23];
    }
}
