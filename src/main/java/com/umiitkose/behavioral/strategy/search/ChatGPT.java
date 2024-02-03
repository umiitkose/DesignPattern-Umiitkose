package com.umiitkose.behavioral.strategy.search;

public class ChatGPT implements Search{
    @Override
    public String search(String text) {
        return text + " için sonuçlar : \n cevap CHATGPT tarafından verilmiştir.";
    }
}
