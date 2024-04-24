package com.umiitkose.behavioral.chain_of_responsibility.kargo;

public enum IlEnum {

    ISTANBUL("İstanbul"),

    ANKARA("Ankara"),

    ANTALYA("Antalya"),

    CANKIRI("Çankırı"),

    KARS("Kars");

    private String il;

    IlEnum(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

    @Override
    public String toString() {
        return "il='" + il;
    }
}
