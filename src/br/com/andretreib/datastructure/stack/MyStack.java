package br.com.andretreib.datastructure.stack;

import java.util.ArrayList;

public class MyStack {
    public ArrayList<String> stack = new ArrayList<String>();

    public void push (String element) {
        stack.add(element);
    }

    public String pop () throws Exception {
        if (stack.size() <= 0) throw new Exception("The stack is empty");
        Integer lastIndex = stack.size() - 1;
        String lastElement = stack.get(lastIndex);
        stack.remove(lastIndex);
        return lastElement;
    }

    public String top () throws Exception {
        if (stack.size() <= 0) throw new Exception("The stack is empty");
        return stack.get(stack.size() - 1);
    }

    public Boolean isEmpty() {
        return stack.size() <= 0;
    }
}
