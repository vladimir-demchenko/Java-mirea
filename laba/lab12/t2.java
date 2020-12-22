package com.company.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t2 {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[0-9]+[ ]*[+]");
        Matcher matcher = pattern.matcher("55 + 95");

        if (matcher.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        Matcher wrong = pattern.matcher("8 * 9");
        if (wrong.find()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

