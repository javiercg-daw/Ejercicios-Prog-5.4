package com.javisoft.ejercicios54.ej516;

public class BladedWeapon extends Weapon {

    private boolean sharp;
    private double bluntDecrease;

    public BladedWeapon(double power, boolean sharp, double bluntDecrease) {
        super(power);
        this.sharp = sharp;
        this.bluntDecrease = bluntDecrease;
    }

    public boolean isSharp() {
        return sharp;
    }

    public void setSharp(boolean sharp) {
        this.sharp = sharp;
    }

    public double getBluntDecrease() {
        return bluntDecrease;
    }

    public void setBluntDecrease(double bluntDecrease) {
        this.bluntDecrease = bluntDecrease;
    }

    @Override
    public double getPower() {
        return this.isSharp() ? super.getPower() : super.getPower() - this.getBluntDecrease();
    }

}
