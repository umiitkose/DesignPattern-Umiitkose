package com.umiitkose.behavioral.strategy.search;

public class Bard implements Search {
    @Override
    public String search(String text) {
        return text + " için sonuçlar : \n  cevap Google tarafından verilmiştir.";
    }




}
