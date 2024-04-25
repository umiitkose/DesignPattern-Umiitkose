package com.umiitkose.behavioral.state.oyunkonsolu;

public class Oyun {

    private Konsol konsol;

    public Oyun() {
        System.out.println("Oyun Başladı..");

        double random = (Math.random() * 2) + 1;

        if ((int) random == 1)
            this.konsol = new Hucum();
        else
            this.konsol = new Defans();
    }

    public void ucgen() {
        konsol.ucgenBas();
    }

    public void kare() {
        konsol.kareBas();
    }

    public void yuvarlak() {
        konsol.yuvarlakBas();
    }

    public void x() {
        konsol.xBas();
    }

    public void topuKap() {
        System.out.println("Top Kapıldı, Hücuma çıkılıyor ! ");
        konsol = new Hucum();
    }

    public void topuKaptir() {
        System.out.println("Top Kaptırıldı, Defans yapılıyor ! ");
        konsol = new Defans();
    }


}
