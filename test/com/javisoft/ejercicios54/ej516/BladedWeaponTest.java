package com.javisoft.ejercicios54.ej516;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BladedWeaponTest {

    private BladedWeapon weapon;

    @BeforeEach
    void setUp() {
        this.weapon = new BladedWeapon(15.0, true, 6.0);
    }

    @ParameterizedTest
    @CsvSource({
            "true, 15.0",
            "false, 9.0",
    })
    void getPower(boolean sharp, double output) {
        weapon.setSharp(sharp);
        assertEquals(weapon.getPower(), output);
    }
}