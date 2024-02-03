package com.umiitkose.behavioral.strategy.search;

public class Main {
    public static void main(String[] args) {
        SearchStrategy searchStrategy = new SearchStrategy(new ChatGPT());
        System.out.println(searchStrategy.giveSearchResult("strategy pattern nedir?"));
    }
}
