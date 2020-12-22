package com.company.prac11.ex1;

public class main {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> arrayQueueModule = new ArrayQueueModule<Integer>(3);
        arrayQueueModule.enqueue(10);
        arrayQueueModule.enqueue(155);
        arrayQueueModule.enqueue(789512);
        System.out.println(arrayQueueModule.size());
        System.out.println(arrayQueueModule.isEmpty());
        System.out.println(arrayQueueModule.element());
        arrayQueueModule.dequeu();
        System.out.println(arrayQueueModule.element());
        arrayQueueModule.clear();
        System.out.println(arrayQueueModule.isEmpty());
    }
}
