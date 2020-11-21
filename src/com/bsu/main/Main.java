package com.bsu.main;

import com.bsu.textProcessor.TextProcessor;

import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        try {

            String filePath = ".\\src\\com\\bsu\\text.txt";

            List<String> words = new TextProcessor(Paths.get(filePath)).getWords();
            for (String word : words) {
                System.out.println(word);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
