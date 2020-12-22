package com.company.lab10;

public class Array <E> {
    private E[] arr;

    public E getArrIndex(int i) {
        return arr[i];
    }

    public void setArr(E[] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return arr.length;
    }

}

