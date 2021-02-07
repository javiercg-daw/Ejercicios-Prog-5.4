package com.javisoft.ejercicios54.ej516;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {

    private Knife knife;

    @BeforeEach
    void setUp() {
        this.knife = new Knife(10.0, true, 4.0, 6.0);
    }

    @ParameterizedTest
    @CsvSource({
            "6.0, 10.0",
            "6.1, 0.0",
            "5.9, 10.0"
    })
    void attack(double distance, double output) {
        assertEquals(knife.attack(distance), output);
    }
}