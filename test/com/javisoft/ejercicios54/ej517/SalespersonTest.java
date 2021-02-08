package com.javisoft.ejercicios54.ej517;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalespersonTest {

    private Salesperson salesperson;

    @BeforeEach
    void setUp() {
        this.salesperson = new Salesperson("04206947V", 1800.00, "Aristoteles Jones", 0.25);
    }

    @Test
    void getPaid() {
        salesperson.sell(862.0);
        assertEquals(salesperson.getPaid(), 2015.5, 0.01);
    }

    @Test
    void toStringTest() {
        assertEquals(salesperson.toString(), "Aristoteles Jones, with DNI 04206947V, sales: 0.0, commission: 25.0%.");
    }
}