package com.company.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array{

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0 ; i < 3;i++)
        {
            list.add(reader.readLine());
        }
        list.remove(2);
        for (int i = 0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
