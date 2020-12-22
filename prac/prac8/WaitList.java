package com.company.prac8;


import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<E>();
    public WaitList(){}
    public WaitList(Collection<E> collection){
        concurrentLinkedQueue.add((E) collection);
    }

    public String toString(){
        String stroka="WaitList.ConcurrentLinkedQueue:";


        for(E col:concurrentLinkedQueue){
            stroka+=col;
            stroka+=" ";
        }
        return  stroka;
    }

    public void add(E element) throws IOException {
        concurrentLinkedQueue.add(element);
    }

    public E remove() {

        return concurrentLinkedQueue.remove();
    }

    public boolean contains(Object element) {
        return concurrentLinkedQueue.contains(element);
    }

    public boolean containsAll(Collection collection) {
        return collection.containsAll(collection);
    }

    public boolean isEmpty() {
        return concurrentLinkedQueue.isEmpty();
    }
}
