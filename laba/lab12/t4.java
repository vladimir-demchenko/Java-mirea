package com.company.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t4 {
    public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        String data = sr.nextLine();

        String reg = "(0[1-9]|1[0-9]|2[0-9]|3[0-1])[/](0[1-9]|1[0-2])[/](19|[2-9][0-9])[0-9][0-9]";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(data);


        if (matcher.find()){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

    }
}