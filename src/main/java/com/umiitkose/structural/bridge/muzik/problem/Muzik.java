package com.umiitkose.structural.bridge.muzik.problem;

// Bahadır Memiş 'in https://www.youtube.com/watch?v=3DhFKSqkX-M dersinden kodları aldık..

public class Muzik {

    private String adi;
    private String ses;

    public Muzik(String adi, String ses) {
        this.adi = adi;
        this.ses = ses;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    @Override
    public String toString() {
        return adi;
    }
}
