package com.bsu.test;

import com.bsu.main.Main;
import com.bsu.textProcessor.TextProcessor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

    @Test
    void textProcessorTest() {

        String text = "This \"huge test\" is pointless; Suzie Smith-Hopper test--hyphens. I can't do it";
        List<String> words = new TextProcessor(text).getWords();

        List<String> ans = new ArrayList<>();
        ans.add("This");
        ans.add("huge test");
        ans.add("is");
        ans.add("pointless");
        ans.add("Suzie");
        ans.add("Smith-Hopper");
        ans.add("test");
        ans.add("hyphens");
        ans.add("I");
        ans.add("can't");
        ans.add("do");
        ans.add("it");

        assertEquals(ans, words);

    }

}
