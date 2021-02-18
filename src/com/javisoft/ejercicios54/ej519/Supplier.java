package com.javisoft.ejercicios54.ej519;

import java.util.Objects;

public class Supplier extends Person {
    private String code;

    public Supplier(String firstName, String lastName, int age, String code) {
        super(firstName, lastName, age);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Supplier supplier = (Supplier) o;
        return code.equals(supplier.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code);
    }
}
