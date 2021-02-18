package com.javisoft.ejercicios54.ej519;

public class Client extends Person {
    private long id;

    public Client(String firstName, String lastName, int age, long id) {
        super(firstName, lastName, age);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
