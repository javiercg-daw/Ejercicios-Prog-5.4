package com.javisoft.ejercicios54.ej519;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.Provider;

import static org.junit.jupiter.api.Assertions.*;

class GroupTest {
    private Group group;

    private final String FN_1 = "Johnny";
    private final String LN_1 = "Smith";
    private final int AGE_1 = 33;
    private final long ID_1 = 1234567890L;
    private final Client PERSON_1 = new Client(FN_1, LN_1, AGE_1, ID_1);

    private final String FN_2 = "Agapito";
    private final String LN_2 = "De Sousa";
    private final int AGE_2 = 44;
    private final String CODE_2 = "AGAPITO_123234";
    private final Supplier PERSON_2 = new Supplier(FN_2, LN_2, AGE_2, CODE_2);

    @BeforeEach
    void setUp() {
        group = new Group();
        group.register(PERSON_1);
    }

    @Test
    void registerReturnsTrueIfAbsent() {
        assertTrue(group.register(PERSON_2));
    }

    @Test
    void registerReturnsFalseIfPresent() {
        assertFalse(group.register(PERSON_1));
    }

    @Test
    void deleteReturnsTrueIfPresent() {
        assertTrue(group.delete(PERSON_1));
    }

    @Test
    void deleteReturnsFalseIfAbsent() {
        assertFalse(group.delete(PERSON_2));
    }
}