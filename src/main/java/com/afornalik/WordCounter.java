package com.afornalik;

public class WordCounter {
    
    private String word;
    private int counter =0;

    public WordCounter() {
        
    }

    public WordCounter(String word) {
        this.word = word;
    }

    public int countWords(String s) {
        if(s.equals(word)){
            return counter;
        }
        return -1;
    }


    public void addWord(String s) {
        word = s;
    }
}
