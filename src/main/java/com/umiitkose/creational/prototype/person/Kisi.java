package com.umiitkose.creational.prototype.person;

public class Kisi implements Cloneable{
    private String ad;
    private String soyad;
    private long yas;
    private Iletisim iletisim;

    public Kisi(String ad, String soyad, long yas, Iletisim iletisim) throws InterruptedException {
        Thread.sleep(1000);
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.iletisim = iletisim;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public long getYas() {
        return yas;
    }

    public void setYas(long yas) {
        this.yas = yas;
    }

    public Iletisim getIletisim() {
        return iletisim;
    }

    public void setIletisim(Iletisim iletisim) {
        this.iletisim = iletisim;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", iletisim=" + iletisim +
                '}';
    }


    @Override
    protected Kisi clone() throws CloneNotSupportedException {
        Kisi kisi = (Kisi) super.clone();
        kisi.setIletisim(iletisim.clone());
        return (Kisi)super.clone();
    }
}
