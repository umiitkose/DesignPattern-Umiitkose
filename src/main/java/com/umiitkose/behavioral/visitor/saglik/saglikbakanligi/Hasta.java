package com.umiitkose.behavioral.visitor.saglik.saglikbakanligi;

public class Hasta {
    private String adi;
    private EnumHastalik hastalik;
    private EnumHastaDurum durum;

    public Hasta(String adi, EnumHastalik hastalik, EnumHastaDurum durum) {
        this.adi = adi;
        this.hastalik = hastalik;
        this.durum = durum;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public EnumHastalik getHastalik() {
        return hastalik;
    }

    public void setHastalik(EnumHastalik hastalik) {
        this.hastalik = hastalik;
    }

    public EnumHastaDurum getDurum() {
        return durum;
    }

    public void setDurum(EnumHastaDurum durum) {
        this.durum = durum;
    }
}
