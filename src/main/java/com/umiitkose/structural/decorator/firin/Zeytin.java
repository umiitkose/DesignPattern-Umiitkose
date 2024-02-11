package com.umiitkose.structural.decorator.firin;

public class Zeytin extends HamurDecorator{

    public Zeytin(Hamur hamur) {
        this.hamur=hamur;
    }

    @Override
    public String getIsim() {
        return hamur.getIsim() + ", Zeytinli";
    }

    @Override
    double maliyet() {
        return hamur.maliyet() + 0.5 ;
    }
}
