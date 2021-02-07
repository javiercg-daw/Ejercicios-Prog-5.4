package com.javisoft.ejercicios54.ej516;

public class Knife extends BladedWeapon {
    private double bladeLength;

    public Knife(double power, boolean sharp, double bluntDecrease, double bladeLength) throws IllegalArgumentException {
        super(power, sharp, bluntDecrease);
        if (bladeLength <= 0) {
            throw new IllegalArgumentException("Invalid blade length.");
        }
        this.bladeLength = bladeLength;
    }

    public double attack(double targetDistance) {
        return (bladeLength >= targetDistance) ? super.attack() : 0.0;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) throws IllegalArgumentException {
        if (bladeLength <= 0) {
            throw new IllegalArgumentException("Invalid blade length.");
        }
        this.bladeLength = bladeLength;
    }
}
