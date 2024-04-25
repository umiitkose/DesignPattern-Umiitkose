package com.umiitkose.behavioral.visitor.saglik.saglikbakanligi;

public interface Visitor {

    String visitHastane(Hastane hastane);

    String visitIl(Il il);

    String visitUlke(Ulke ulke);
}
