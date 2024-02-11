package com.umiitkose.structural.decorator.firin;

public class Sut extends HamurDecorator{

    public Sut(Hamur hamur) {
        this.hamur=hamur;
    }

    @Override
    double maliyet() {
        return hamur.maliyet() + 1;
    }

    @Override
    public String getIsim() {
        return hamur.getIsim() + ", Sütlü";
    }
}
