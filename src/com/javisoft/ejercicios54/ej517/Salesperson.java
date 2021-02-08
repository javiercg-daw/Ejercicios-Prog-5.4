package com.javisoft.ejercicios54.ej517;

public class Salesperson extends Employee {
    private double sales;
    private double commission;

    public Salesperson(String dni, double salary, String name, double sales, double commission) {
        super(dni, salary, name);
        this.sales = sales;
        this.commission = commission;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double getPaid() {
        return super.getSalary() + sales * commission;
    }

    public void sell(double amount) {
        this.setSales(sales + amount);
    }
}
