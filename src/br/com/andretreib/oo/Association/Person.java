package br.com.andretreib.oo.Association;

public class Person {
    private String name;
    private Person marriedTo = null;

    Person (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void marry(Person person) {
        this.marriedTo = person;
    }

    public String isMarriedTo() {
        if (this.marriedTo == null) return "";
        return this.marriedTo.getName();
    }
}
