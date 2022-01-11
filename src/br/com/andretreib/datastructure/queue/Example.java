package br.com.andretreib.datastructure.queue;

public class Example {
    public static void main(String[] args) {
        try {
            MyQueue queue = new MyQueue();
            queue.enqueue("first");
            queue.enqueue("second");
            queue.enqueue("third");
            String removed = queue.dequeue();
            queue.enqueue("fourth");

            System.out.println("We pushed 4 elements to our queue");
            System.out.printf("We removed 1 element from our queue, which was: %s%n", removed);
            System.out.printf("Is our queue empty? %s%n", queue.isEmpty().toString());
            System.out.printf("The next element we're going to have access is the oldest from our queue: %s%n", queue.top());
            System.out.println("This is our queue at the end of this program:");
            queue.printQueue();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
