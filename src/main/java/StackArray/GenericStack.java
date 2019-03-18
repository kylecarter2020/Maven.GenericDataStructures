package StackArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E>{
    private E[] elements;

    public GenericStack() {
        elements = (E[])new Object[1];
    }

    public Boolean isEmpty() {
        for (E e : this.elements) {
            if(e != null){
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

    public E pop() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Ain't nutn left to pop!");
        }
        E item = elements[elements.length-1];
        elements[elements.length-1] = null;
        elements = Arrays.copyOf(elements, elements.length-1);
        return item;
    }
}
