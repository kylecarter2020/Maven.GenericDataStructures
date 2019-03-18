package StackArrayList;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;

    public Stack(){
        elements = new ArrayList();
    }

    public Boolean isEmpty() {
        return elements.isEmpty();
    }

    public void push(E foobar) {
        this.elements.add(foobar);
    }

    public E pop() {
        if(elements.isEmpty()){
            throw new IndexOutOfBoundsException("Ain't nutn left to pop!");
        }
        E item = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return item;
    }
}
