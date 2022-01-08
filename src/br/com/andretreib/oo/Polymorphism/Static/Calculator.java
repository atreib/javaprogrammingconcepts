package br.com.andretreib.oo.Polymorphism.Static;

import java.util.stream.IntStream;

public class Calculator {
    int add (int a, int b) {
        return a + b;
    }

    int add (int[] numbers) {
        return IntStream.of(numbers).sum();
    }
}
