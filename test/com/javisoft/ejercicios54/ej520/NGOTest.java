package com.javisoft.ejercicios54.ej520;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NGOTest {
    private NGO ngo;
    private final Volunteer eustaquio = new Volunteer("Eustaquio", 78);
    private final Volunteer mora = new Volunteer("DoubleB", 67);
    private final Volunteer agapito = new Volunteer("Agapito", 89);
    private final Volunteer antonio = new Volunteer("Antonio", 56);
    private final Volunteer[] oldVolunteers = {eustaquio, mora, agapito, antonio};

    @BeforeEach
    void setUp() {
        ngo = new NGO();
        Arrays.stream(oldVolunteers).forEach(v -> ngo.addVolunteer(v));
    }

    @Test
    void nextReturnsOldestVolunteerOnFirstCall() {
        assertEquals(ngo.next().get(), agapito);
    }

    @Test
    void nextReturnsYoungestVolunteerOnSecondCall() {
        ngo.next();
        assertEquals(ngo.next().get(), antonio);
    }

    @Test
    void nextReturnsOldestVolunteerOnThirdCall() {
        ngo.next();
        ngo.next();
        assertEquals(ngo.next().get(), eustaquio);
    }

    @Test
    void nextReturnsNullIfEmpty() {
        ngo = new NGO();
        assertEquals(ngo.next(), Optional.empty());
    }
}