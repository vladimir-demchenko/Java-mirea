package com.company.prac10.ex1;

public class ConcreteFactory  implements CompexAbstractFactory{
    public Complex createComplex(){
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex(real,image);
    }
}
