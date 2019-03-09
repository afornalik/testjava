package com.afornalik;

import org.junit.Assert;
import org.junit.Test;

public class WordCounterTest {

    private static final String ANY_STRING= "kot";


    @Test
    public void shouldReturnZeroCountAnyWord() {

        WordCounter wordCounter = new  WordCounter(ANY_STRING);

        int result = wordCounter.countWords(ANY_STRING);

        Assert.assertEquals(0,result);
    }

    @Test
    public void getCountShouldReturnTwo() {

        WordCounter wordCounter = new  WordCounter(ANY_STRING);

        wordCounter.addWord(ANY_STRING);



        int result = wordCounter.countWords(ANY_STRING);

        Assert.assertEquals(1,result);
    }

    @Test
    public void shouldReturnZeroIfDifferentWords() {

        WordCounter wordCounter = new  WordCounter(ANY_STRING);

        wordCounter.addWord(ANY_STRING);



        int result = wordCounter.countWords("pies");

        Assert.assertEquals(0,result);
    }
}
