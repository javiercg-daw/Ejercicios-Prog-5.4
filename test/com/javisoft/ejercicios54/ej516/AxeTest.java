package com.javisoft.ejercicios54.ej516;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AxeTest {

    private Axe axe;

    @BeforeEach
    void setUp() {
        this.axe = new Axe(1, true, 1, 1);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3})
    void setEdgesThrowsException(int edges) {
        assertThrows(IllegalArgumentException.class, () -> axe.setEdges(edges));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 3})
    void constructorThrowsException(int edges) {
        assertThrows(IllegalArgumentException.class, () -> new Axe(1, true, 1, edges));
    }
}