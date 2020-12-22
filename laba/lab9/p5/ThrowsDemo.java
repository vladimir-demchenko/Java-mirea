package com.company.lab9.p5;

public class ThrowsDemo {
    public void printMessage(String key){
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        try{
            if (key == null) {
                throw new NullPointerException(" null key in getDetails");
            }
        }catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        return "data for " + key;
    }
}
