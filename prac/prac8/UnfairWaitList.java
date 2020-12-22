package com.company.prac8;

import java.io.IOException;

public class UnfairWaitList<E> extends  WaitList {
    public UnfairWaitList(){}


    public void add(Object element) {
        this.concurrentLinkedQueue.add(element);
    }

    public void remove(E element){

        this.concurrentLinkedQueue.remove(element);
    }
    public void moveToBack(E element){
        this.concurrentLinkedQueue.add((this.concurrentLinkedQueue.poll()));
    }
}

