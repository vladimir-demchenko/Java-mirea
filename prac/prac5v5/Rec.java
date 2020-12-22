package com.company.prac5v5;

public class Rec{
    static int sum = 0;
    public static int recursion(double n){
        if (n<= 0){
            return sum;
        } else {
            sum+=n%10;
            return recursion(n/10);
        }
    }
}
