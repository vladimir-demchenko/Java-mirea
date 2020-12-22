package com.company.lab9.p2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = sr.next();
        int i = Integer.parseInt(intString);
        System.out.println(2/i);
    }
}
