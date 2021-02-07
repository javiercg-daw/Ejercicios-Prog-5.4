package com.javisoft.ejercicios54.ej516;

public class Shotgun extends Firearm {
    private boolean sawedOff;
    private double sawedOffIncrease;

    public Shotgun(double power, boolean loaded, boolean sawedOff, double sawedOffIncrease) {
        super(power, loaded);
        this.sawedOff = sawedOff;
        this.sawedOffIncrease = sawedOffIncrease;
    }

    @Override
    public double getPower() {
        return sawedOff ? sawedOffIncrease + super.getPower() : super.getPower();
    }

    public boolean isSawedOff() {
        return sawedOff;
    }

    public void setSawedOff(boolean sawedOff) {
        this.sawedOff = sawedOff;
    }

    public double getSawedOffIncrease() {
        return sawedOffIncrease;
    }

    public void setSawedOffIncrease(double sawedOffIncrease) {
        this.sawedOffIncrease = sawedOffIncrease;
    }
}
