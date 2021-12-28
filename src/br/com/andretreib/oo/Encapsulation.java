package br.com.andretreib.oo;

public class Encapsulation {
    private Integer minimum;
    private Integer total = 0;

    Encapsulation (Integer initialMinimum) {
        this.minimum = initialMinimum;
    }

    public boolean isEnough() {
        return this.total > this.minimum;
    }

    public void add(Integer value) {
        this.total += value;
    }
}

class RunExample {
    public static void main(String[] args) {
        Encapsulation example = new Encapsulation(100);
        System.out.println("It's enough? " + example.isEnough());
        example.add(200);
        System.out.println("It's enough? " + example.isEnough());
        // example.total; // It's not going to compile
    }
}
