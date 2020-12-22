package com.company.lab9.p1;

public class Exception1 {
    public void exceptionDemo(){
        try{
            System.out.println(2/0);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }

}
