package com.javisoft.ejercicios54.ej516;

public class Firearm extends Weapon {
    private boolean loaded;

    public Firearm(double power, boolean loaded) {
        super(power);
        this.loaded = loaded;
    }

    public void load() {
        this.setLoaded(true);
    }

    public void unload() {
        this.setLoaded(false);
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public boolean shoot() {
        if (loaded) {
            unload();
            return true;
        }
        return false;
    }

    public double attack() {
        if (shoot()) {
            return this.getPower();
        }
        return 0.0;
    }
}
