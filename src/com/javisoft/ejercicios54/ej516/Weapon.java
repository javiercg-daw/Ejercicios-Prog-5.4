package com.javisoft.ejercicios54.ej516;

public class Weapon {
    private double power;

    public Weapon(double power) throws IllegalArgumentException {
        if (power <= 0) {
            throw new IllegalArgumentException("Invalid power: must be greater than 0.");
        }
        this.power = power;
    }

    public double attack() {
        return power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) throws IllegalArgumentException {
        if (power <= 0) {
            throw new IllegalArgumentException("Invalid power: must be greater than 0.");
        }
        this.power = power;
    }
}