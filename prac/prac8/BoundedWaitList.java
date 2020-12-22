package com.company.prac8;

import java.io.IOException;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity=capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    @Override
    public void add(E element)throws IOException {
        if(this.concurrentLinkedQueue.size()<this.capacity){
            this.concurrentLinkedQueue.add(element);
        }
        else throw new IOException("No place, element: "+element +" doesn't add");
    }

    @Override
    public String toString() {
        String stroka="BoundedWaitList :";
        for(Object element:this.concurrentLinkedQueue){
            stroka=stroka+element+" ";
        }
        return  stroka;
    }
}
