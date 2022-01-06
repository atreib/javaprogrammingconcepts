package br.com.andretreib.oo.Association;

public class Example {
    public static void main(String[] args) {
        Person andre = new Person("Andre");
        Person giovana = new Person("Giovana");
        Person kid = new Person("Joseph");

        andre.marry(giovana);
        giovana.marry(andre);

        System.out.printf("Andre is married with %s \n", andre.isMarriedTo());
        System.out.printf("Giovana is married to %s \n", giovana.isMarriedTo());
        System.out.printf("Joseph, which is a kid, isn't married with anyone, so it returns: ", kid.isMarriedTo());
    }
}
