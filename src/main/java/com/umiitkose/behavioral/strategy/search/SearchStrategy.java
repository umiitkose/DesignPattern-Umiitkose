package com.umiitkose.behavioral.strategy.search;

public class SearchStrategy {
    Search search;

    public SearchStrategy(Search search) {
        this.search = search;
    }

    public String giveSearchResult(String text) {
        return search.search(text);
    }


}
