package com.javisoft.ejercicios54.ej516;

public class Pistol extends Firearm {
    private int caliber;
    private boolean magnum;

    public Pistol(double power, boolean loaded, int caliber, boolean magnum) throws IllegalArgumentException {
        super(power, loaded);
        if (caliber <= 0) {
            throw new IllegalArgumentException("Invalid caliber provided.");
        }
        this.caliber = caliber;
        this.magnum = magnum;
    }

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) throws IllegalArgumentException {
        if (caliber <= 0) {
            throw new IllegalArgumentException("Invalid caliber provided.");
        }
        this.caliber = caliber;
    }

    public boolean isMagnum() {
        return magnum;
    }

    public void setMagnum(boolean magnum) {
        this.magnum = magnum;
    }

    @Override
    public double getPower() {
        int modifier = 1;
        if (this.isMagnum()) {
            modifier = 2;
        }
        return super.getPower() * (modifier + this.getCaliber() / 1000.00);
    }
}
