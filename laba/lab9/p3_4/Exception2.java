package com.company.lab9.p3_4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo(){
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NumberFormatException ex){
            System.err.println(ex.getMessage()+" "+ ex.getClass());
        }
        finally {
            System.out.println("finally");
        }
    }
}
