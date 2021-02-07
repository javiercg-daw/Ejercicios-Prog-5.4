package com.javisoft.ejercicios54.ej516;

public class Axe extends BladedWeapon {
    private int edges;

    public Axe(double power, boolean sharp, double bluntDecrease, int edges) throws IllegalArgumentException {
        super(power, sharp, bluntDecrease);
        if (edges < 1 || edges > 2) {
            throw new IllegalArgumentException("Incorrect number of edges.");
        }
        this.edges = edges;
    }

    public int getEdges() {
        return edges;
    }

    public void setEdges(int edges) throws IllegalArgumentException {
        if (edges < 1 || edges > 2) {
            throw new IllegalArgumentException("Incorrect number of edges.");
        }
        this.edges = edges;
    }
}
