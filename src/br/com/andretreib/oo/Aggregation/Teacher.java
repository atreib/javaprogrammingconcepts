package br.com.andretreib.oo.Aggregation;

/**
 * Our class Teacher exists by itself
 */
public class Teacher {
    private String name;

    Teacher (String _name) {
        this.name = _name;
    }

    public String getName() {
        return this.name;
    }
}
