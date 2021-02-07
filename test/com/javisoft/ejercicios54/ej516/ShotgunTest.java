package com.javisoft.ejercicios54.ej516;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ShotgunTest {

    private Shotgun daisy;

    @BeforeEach
    void setUp() {
        daisy = new Shotgun(60.0, true, true, 9.0);
    }

    @ParameterizedTest
    @CsvSource({
            "true, 69.0",
            "false, 60.0"
    })
    void getPower(boolean sawedOff, double output) {
        daisy.setSawedOff(sawedOff);
        assertEquals(daisy.getPower(), output, 0.01);
    }
}