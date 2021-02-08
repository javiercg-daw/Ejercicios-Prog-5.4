package com.javisoft.ejercicios54.ej517;

public class SecurityGuard extends Employee {
    private int nights;
    private double nightlyBonus;

    public SecurityGuard(String dni, double salary, String name, double nightlyBonus) throws IllegalArgumentException {
        super(dni, salary, name);
        if (nightlyBonus <= 0) {
            throw new IllegalArgumentException("Invalid nightly bonus provided.");
        }
        this.nights = 0;
        this.nightlyBonus = nightlyBonus;
    }

    @Override
    public double getPaid() {
        return super.getSalary() + this.nights * nightlyBonus;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) throws IllegalArgumentException {
        if (nights < 0) {
            throw new IllegalArgumentException("Invalid night count provided.");
        }
        this.nights = nights;
    }

    public void addNight() {
        this.setNights(this.getNights() + 1);
    }

    public double getNightlyBonus() {
        return nightlyBonus;
    }

    public void setNightlyBonus(double nightlyBonus) throws IllegalArgumentException {
        if (nightlyBonus <= 0) {
            throw new IllegalArgumentException("Invalid nightly bonus provided.");
        }
        this.nightlyBonus = nightlyBonus;
    }

    @Override
    public String toString() {
        return getName() + ", with DNI " + getDni() + ", nights worked: " + nights + ", nightly bonus: " + nightlyBonus;
    }
}
