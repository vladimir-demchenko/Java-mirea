package com.company.prac12;

public class ex4 {
    private String code;
    private String firstpart;
    private String middlepart;
    private String lastpart;
    private String formatted;

    ex4(String num){
        StringBuilder ss = new StringBuilder(num);
        this.code = ss.substring(0, ss.length()-10);
        if (code.equals("8")){
            this.code = "+7";
        }
        this.firstpart = ss.substring(ss.length()-10, ss.length()-7);
        this.middlepart = ss.substring(ss.length()-7, ss.length()-4);
        this.lastpart = ss.substring(ss.length()-4, ss.length());

        formatted = new StringBuilder().append(code).append(firstpart).append(middlepart).append(lastpart).toString();
    }

    public String getFormatted() {
        return formatted;
    }
}
