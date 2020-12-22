package com.company.prac10.ex1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        Complex complex = concreteFactory.CreateComplex(85,19);
        System.out.println(complex);
    }
}
