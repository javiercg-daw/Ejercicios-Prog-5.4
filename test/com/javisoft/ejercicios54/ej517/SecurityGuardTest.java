package com.javisoft.ejercicios54.ej517;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SecurityGuardTest {

    private SecurityGuard guard;
    private final String dni = "66666666Q";
    private final double salary = 1234.56;
    private final String name = "Antonio Pérez";
    private final double nightlyBonus = 86.0;

    @BeforeEach
    void setUp() {
        guard = new SecurityGuard(dni, salary, name, nightlyBonus);
    }

    @ParameterizedTest
    @CsvSource({
            "3,     1492.56",
            "12,    2266.56"
    })
    void getPaid(int nights, double output) {
        guard.setNights(nights);
        assertEquals(guard.getPaid(), output);
    }

    @Test
    void setNightlyBonusThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> guard.setNightlyBonus(0.0));
    }

    @Test
    void setNightsThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> guard.setNights(-1));
    }

    @Test
    void constructorThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> new SecurityGuard(dni, salary, name, 0));
    }

}