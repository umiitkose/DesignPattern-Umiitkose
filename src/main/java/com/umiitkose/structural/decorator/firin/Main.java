package com.umiitkose.structural.decorator.firin;

public class Main {
    public static void main(String[] args) {
        Hamur ekmek = new Ekmek();
        ekmek = new Sut(new Zeytin(ekmek));
        System.out.println(ekmek.getIsim() + " -> " + ekmek.maliyet() + " TL");

        Hamur pide = new Pide();
        pide = new Sut(pide);
        System.out.println(pide.getIsim() + " -> " + pide.maliyet() + " TL");

        Hamur ekmek1 = new Ekmek();
        ekmek1 = new Cavdar(new Sut(new Zeytin(ekmek1)));
        System.out.println(ekmek1.getIsim() + " -> " + ekmek1.maliyet() + " TL");
    }
}
