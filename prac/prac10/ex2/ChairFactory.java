package com.company.prac10.ex2;


public class ChairFactory implements AbstractChairFactory{
    @Override
    public FunctionalChair createFunctionalChair() {
        System.out.println("Creating Functional chair");
        return new FunctionalChair();
    }

    @Override
    public MagicChair createMagicanChair() {
        System.out.println("Creating Magic chair");
        return new MagicChair();
    }

    @Override
    public VictorianChair createVictorianChair() {
        System.out.println("Creating Victorian chair");
        return new VictorianChair(150);
    }
}
