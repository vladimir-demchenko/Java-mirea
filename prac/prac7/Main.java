package com.company.prac7;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Game game= new Game();
        ArrayDeque<Integer> first= (ArrayDeque<Integer>) AddDeque.addDeq();
        ArrayDeque<Integer> second= (ArrayDeque<Integer>) AddDeque.addDeq();
        Result result=game.game(first,second);
        System.out.println(result.comand+ " "+ result.kol);
    }
}

