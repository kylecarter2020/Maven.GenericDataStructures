package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[1];
    }

    public Boolean isEmpty() {
        for (Object o : this.elements) {
            if(o != null){
                return false;
            }
        }
        return true;
    }

    public void push(E foobar) {
        if(isEmpty()){
            elements[elements.length-1] = foobar;
        }
        else {
            elements = Arrays.copyOf(elements, elements.length+1);
            elements[elements.length-1] = foobar;
        }
    }

    public Object pop() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Ain't nutn left to pop!");
        }
        Object item = elements[elements.length-1];
        elements[elements.length-1] = null;
        elements = Arrays.copyOf(elements, elements.length-1);
        return item;
    }
}
