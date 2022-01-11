package br.com.andretreib.datastructure.queue;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> queue = new ArrayList<String>();

    public void enqueue (String element) {
        this.queue.add(element);
    }

    public String dequeue () throws Exception {
        if (this.queue.size() <= 0) throw new Exception("The queue is empty");
        String oldestElement = this.queue.get(0);
        this.queue.remove(0);
        return oldestElement;
    }

    public String top () throws Exception {
        if (this.queue.size() <= 0) throw new Exception("The queue is empty");
        return this.queue.get(0);
    }

    public Boolean isEmpty() {
        return this.queue.size() <= 0;
    }

    public void printQueue() {
        for (int i = 0; i < this.queue.size(); i++) {
            System.out.printf("%d. %s%n", i, this.queue.get(i));
        }
    }
}
