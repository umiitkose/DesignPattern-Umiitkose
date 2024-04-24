package com.umiitkose.behavioral.chain_of_responsibility.kargo;

public class Main {

    public static void main(String[] args) {
        KargoSirketi kargoSirketi = SbmKargo.getKargoSirketi();

        kargoSirketi.kargola(IlEnum.KARS);

        System.out.println("\n ------------ \n ");

        kargoSirketi.kargola(IlEnum.ANKARA);

        System.out.println("\n ------------ \n ");

        kargoSirketi.kargola(IlEnum.ISTANBUL);

        System.out.println("\n ------------ \n ");

        kargoSirketi.kargola(IlEnum.ANTALYA);
    }
}
