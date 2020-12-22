package com.company.prac10.ex2;

public class Main implements Chair {
    public static void main(String[] args) {
        AbstractChairFactory chairFactory = new ChairFactory();

        MagicChair magicChair = chairFactory.createMagicanChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();
        VictorianChair victorianChair = chairFactory.createVictorianChair();

        Client client = new Client();
        client.setChair(magicChair);

        System.out.println(functionalChair.sum(1785,6488));
        System.out.println(victorianChair.getAge());
        magicChair.doMagic();
    }
}
