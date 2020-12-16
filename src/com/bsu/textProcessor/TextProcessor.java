package com.bsu.textProcessor;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {

    private List<String> text;

    public TextProcessor(Path path) {

        text = new ArrayList<>();

        try (Scanner scanner = new Scanner(path)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                text.add(line);
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public List<String> getWords() {

        List<String> words = new ArrayList<>();

        Matcher matcher;
        for (String str : text) {
            matcher = Pattern.compile("(?<=\")[^\"]+(?=\")|\\b(\\w+[-'])*\\w+")
                    .matcher(str);
            while (matcher.find()) {
                words.add(matcher.group());
            }
        }

        return words;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
    public List<String> getText() {
        return text;
    }

    public TextProcessor(String text) {
        this.text = new ArrayList<>();
        this.text.add(text);
    }

}
