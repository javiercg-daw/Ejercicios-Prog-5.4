package com.javisoft.ejercicios54.ej516;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PistolTest {

    private Pistol pistol;

    @BeforeEach
    void setUp() {
        this.pistol = new Pistol(30.0, true, 357, true);
    }

    @ParameterizedTest
    @CsvSource({
            "true, 70.71",
            "false, 40.71"
    })
    void getPower(boolean magnum, double output) {
        pistol.setMagnum(magnum);
        assertEquals(pistol.getPower(), output, 0.01);
    }
}