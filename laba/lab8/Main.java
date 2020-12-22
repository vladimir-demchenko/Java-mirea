package com.company.lab8;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String text = sr.nextLine();
        try(FileWriter writer = new FileWriter("note.txt", true)) {
            writer.write(text);
            writer.write('\n');
            writer.flush();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}


