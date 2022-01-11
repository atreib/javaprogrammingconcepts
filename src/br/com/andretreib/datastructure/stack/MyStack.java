package br.com.andretreib.datastructure.stack;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> stack = new ArrayList<String>();

    public void push (String element) {
        this.stack.add(element);
    }

    public String pop () throws Exception {
        if (this.stack.size() <= 0) throw new Exception("The stack is empty");
        Integer lastIndex = this.stack.size() - 1;
        String lastElement = this.stack.get(lastIndex);
        this.stack.remove(lastIndex);
        return lastElement;
    }

    public String top () throws Exception {
        if (this.stack.size() <= 0) throw new Exception("The stack is empty");
        return this.stack.get(this.stack.size() - 1);
    }

    public Boolean isEmpty() {
        return this.stack.size() <= 0;
    }
}
