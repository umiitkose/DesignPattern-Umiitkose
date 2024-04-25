package com.umiitkose.behavioral.mediator.halsistemi;

public enum UrunEnum {

    DOMATES("Domates"), SALATALIK("Salatalık");

    private String urun;

    UrunEnum(String urun) {
        this.urun = urun;
    }

    public String getUrun() {
        return urun;
    }
}
