package Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    E foo;
    E bar;
    List<E> list;


    public Pair(E foo, E bar) {
        this.foo = foo;
        this.bar = bar;
        this.list = new ArrayList<>();
        this.list.add(foo);
        this.list.add(bar);
        Collections.sort(this.list);
    }

    public E getFirst() {
        return this.foo;
    }

    public E getSecond() {
        return this.bar;
    }

    public E min() {
        return this.list.get(0);
    }

    public E max() {
        return this.list.get(1);
    }
}
