package br.com.andretreib.datastructure.stack;

public class Example {
    public static void main(String[] args) {
        try {
            MyStack stack = new MyStack();
            stack.push("first");
            stack.push("second");
            stack.push("third");
            String removed = stack.pop();
            stack.push("fourth");

            System.out.println("We pushed 4 elements to our stack");
            System.out.printf("We removed 1 element from our stack, which was: %s%n", removed);
            System.out.printf("Is our stack empty? %s%n", stack.isEmpty().toString());
            System.out.printf("The next element we're going to have access is the last we added to our stack: %s%n", stack.top());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
