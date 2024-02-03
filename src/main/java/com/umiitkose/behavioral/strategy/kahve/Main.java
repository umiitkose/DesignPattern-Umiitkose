package com.umiitkose.behavioral.strategy.kahve;

public class Main {
    public static void main(String[] args) {
        KahveHazirla kahveYap=new KahveHazirla(new FiltreKahve());
        kahveYap.kahveHazirla();


    }
}
