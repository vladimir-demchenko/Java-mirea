package com.company.lab10;

import java.util.ArrayList;

public class Main extends Array {

    public static <E> void  anyTypeMassive  (String s, E [] arr) {

        E[] a = arr;
        Array<E> sid = new Array<E>();
        sid.setArr(a);

        System.out.print(s + "  ");

        for (int i = 0; i < sid.getLength(); i++)
            System.out.print(sid.getArrIndex(i) + " ");

        System.out.println();
    }



    public static void main(String [] args){

        String [] s = {"Hello", "World","!"};
        anyTypeMassive("String" , s);

        Integer [] intr = { 1,2,3,4,5,6,7,8,9,10};
        anyTypeMassive("Integer" , intr);

        Double [] ad = {1.1,1.2,1.3,1.4,1.5,1.6};
        anyTypeMassive("Double" , ad);

    }

}

