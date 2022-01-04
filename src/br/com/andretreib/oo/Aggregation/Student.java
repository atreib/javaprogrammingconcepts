package br.com.andretreib.oo.Aggregation;

/**
 * Our class Student exists by itself
 */
public class Student {
    private String name;

    Student (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
