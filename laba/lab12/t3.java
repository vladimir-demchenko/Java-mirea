package com.company.lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t3 {
    public static void main(String[] args)  {

        String text = "25.98 USD\n" +
                "44 ERR, 0.004 EU\n" +
                "1500 RUB\n" +
                "1231234 R";





        String reg = "(\\d*[.]*)\\d+[ ]((USD)|(RUB)|(EU))";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
