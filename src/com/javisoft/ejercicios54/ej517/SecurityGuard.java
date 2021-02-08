package com.javisoft.ejercicios54.ej517;

public class SecurityGuard extends Employee {
    private int nights;
    private double nightlyBonus;

    public SecurityGuard(String dni, double salary, String name, int nights, double nightlyBonus) {
        super(dni, salary, name);
        this.nights = nights;
        this.nightlyBonus = nightlyBonus;
    }

    @Override
    public double getPaid() {
        return super.getSalary() + this.nights * nightlyBonus;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public double getNightlyBonus() {
        return nightlyBonus;
    }

    public void setNightlyBonus(double nightlyBonus) {
        this.nightlyBonus = nightlyBonus;
    }
}
