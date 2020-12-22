package com.company.prac12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex5 {
    public static StringBuilder getLine(String... words){
        StringBuilder result = new StringBuilder();
        if (words == null || words.length == 0) return result;
        if (words.length == 1 || words[0].equals("")) return result.append(words[0]);

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        while (wordsList.remove("")){
            wordsList.remove("");
        }
        while (isYes(wordsList)) {
            Collections.shuffle(wordsList);
        }
        for (String word: wordsList){
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result;
    }

    private static boolean isYes(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();
            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        StringBuilder fileData = null;
        Scanner sr = new Scanner(System.in);
        String filePath = sr.nextLine();
        FileReader f = new FileReader(filePath);
        int i;
        while ((i=f.read()) != -1) {
            fileData.append((char)i);
        }
        StringBuilder result = getLine(fileData.toString().split(" "));
        System.out.println(result.toString());
    }
}
