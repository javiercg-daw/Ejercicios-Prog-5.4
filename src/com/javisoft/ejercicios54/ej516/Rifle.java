package com.javisoft.ejercicios54.ej516;

public class Rifle extends Firearm {
    private double range;

    public Rifle(double power, boolean loaded, double range) throws IllegalArgumentException {
        super(power, loaded);
        if (range <= 0) {
            throw new IllegalArgumentException("Invalid range.");
        }
        this.range = range;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) throws IllegalArgumentException {
        if (range <= 0) {
            throw new IllegalArgumentException("Invalid range.");
        }
        this.range = range;
    }

    public boolean shoot(double targetDistance) {
        if (this.isLoaded() && this.range >= targetDistance) {
            this.unload();
            return true;
        }
        return false;
    }

}
