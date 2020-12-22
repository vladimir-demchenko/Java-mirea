package com.company.lab12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t1 {

    public static void main(String[] args) {
        String rightInput = "abcdefghijklmnopqrstuv18340";
        String wrongInput = "abcdefghijklmnoasdfasdpqrstuv18340.";
        boolean found = Pattern.matches("abcdefghijklmnopqrstuv18340", rightInput);
        if (found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");

        boolean found1 = Pattern.matches("abcdefghijklmnopqrstuv18340", wrongInput);
        if (found1)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");


    }
}

