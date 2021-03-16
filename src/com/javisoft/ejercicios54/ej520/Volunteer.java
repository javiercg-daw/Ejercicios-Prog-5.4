package com.javisoft.ejercicios54.ej520;

import java.util.Objects;

public class Volunteer {
    private String name;
    private int age;

    public Volunteer(String name, int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than zero.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be greater than zero.");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volunteer volunteer = (Volunteer) o;
        return age == volunteer.age && name.equals(volunteer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
