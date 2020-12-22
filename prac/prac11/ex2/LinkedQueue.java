package com.company.prac11.ex2;

import java.util.AbstractList;

public class LinkedQueue<E> {
    private AbstractList<E> abstractList = new AbstractList<E>() {
        @Override
        public E get(int index) {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    };
    public boolean add(Object element){
        abstractList.add((E) element);
        return true;
    }

    public boolean contains(Object obj){
        return abstractList.contains(obj);
    }

    public boolean isEmpty() {
        return abstractList.isEmpty();
    }



    public Object peek() {
        return abstractList.get(0);
    }

    public Object pool() {
        return null;
    }
}

