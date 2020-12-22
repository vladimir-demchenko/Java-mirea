package com.company.lab9.p8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key: ");
            String key = myScanner.nextLine();
            printDetails(key);
        } catch (Exception e) {
            //System.err.println(e.getMessage());

            this.getKey();

        }

    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

}

