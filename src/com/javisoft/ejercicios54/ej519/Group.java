package com.javisoft.ejercicios54.ej519;

import java.util.HashSet;

public class Group {
    private final HashSet<Person> persons;

    public Group() {
        this.persons = new HashSet<>();
    }

    public boolean register(Person person) {
        return persons.add(person);
    }

    public boolean delete(Person person) {
        return persons.remove(person);
    }
}
