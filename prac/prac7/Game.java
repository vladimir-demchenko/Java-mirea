package com.company.prac7;

import java.util.ArrayDeque;

public class Game {
    public int getKol() {
        return kol;
    }

    private int kol=0;
    public Result game(ArrayDeque<Integer> first, ArrayDeque<Integer> second){

        int schet=0;
        while(first.size()>0 && second.size()>0 && schet<=106){

            kol++;
            schet++;

            int firstsal = first.pollFirst();
            int secondal = second.pollFirst();

            if (firstsal > secondal && firstsal != 0 && firstsal != 9) {

                first.addLast(firstsal);
                first.addLast(secondal);
            }
            if (firstsal < secondal && secondal != 0 && secondal != 9) {
                second.addLast(firstsal);
                second.addLast(secondal);
            }
            if (firstsal == 0 && secondal == 9) {
                first.addLast(firstsal);
                first.addLast(secondal);
            }
            if (secondal == 0 && firstsal == 9) {
                second.addLast(firstsal);
                second.addLast(secondal);
            }


        }
        if(schet>=107) return new Result("botva",0);
        if(first.size()==0) return new Result("second",kol);
        else return new Result("first",kol);


    }
}

