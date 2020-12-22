package com.company.prac11.ex1;

import java.util.Arrays;

public class ArrayQueueModule<T> {
    private T mas[];
    private int capacity = 0;
    private int pozition = 0;
    public ArrayQueueModule(int size){
        this.capacity = size;
        this.mas = (T[]) new Object[size];
    }

    public int getCapacity(){
        return capacity;
    }

    public int getPozition() {
        return pozition;
    }

    public void enqueue(Object element) {
        if (pozition == mas.length){
            T mas2[] = (T[]) new Object[capacity*2];
            capacity = mas2.length;
            mas = mas2;
            mas[pozition] = (T) element;
            pozition++;
        } else {
            mas[pozition] = (T) element;
            pozition++;
        }
    }

    public Object element(){
        return mas[0];
    }

    public Object dequeu(){
        Object object = mas[0];
        T mas2[] = Arrays.copyOfRange(mas,1,mas.length-1);
        for (int i=0; i<mas2.length;i++)
            mas[i]=mas2[i];
        return object;
    }

    public int size(){
        return mas.length;
    }

    public boolean isEmpty(){
        return pozition==0;
    }

    public void clear(){
        for (int i=0;i<mas.length;i++)
            pozition=0;
    }
}
