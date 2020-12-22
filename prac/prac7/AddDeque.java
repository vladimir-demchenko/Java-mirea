package com.company.prac7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class AddDeque {
    public static Deque<Integer> addDeq(){
        ArrayDeque<Integer> deq= new ArrayDeque<Integer>();
        Scanner In= new Scanner(System.in);
        for(int i=0;i<5;i++){
            deq.add(In.nextInt());
        }
        return deq;
    }
}
