package br.com.andretreib.oo.Polymorphism.Dynamic;

class Example {
    public static void main(String[] args) {
        Animal parentAnimal = new Animal(); // Animal reference and object
        Animal dog = new Dog(); // Animal reference, Dog object
        Animal duck = new Duck(); // Animal reference, Duck object
        Cat cat = new Cat(); // Cat reference and object

        System.out.println("An animal says: " + parentAnimal.speak()); // Output: "aaaa"
        System.out.println("A dog says: " + dog.speak()); // Output: "Woof"
        System.out.println("A duck says: " + duck.speak()); // Output: "Quack"
        System.out.println("A cat says: " + cat.speak()); // Output: "Meow"
    }
}
