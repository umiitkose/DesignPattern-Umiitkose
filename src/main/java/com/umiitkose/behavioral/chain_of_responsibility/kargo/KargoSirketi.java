package com.umiitkose.behavioral.chain_of_responsibility.kargo;

public abstract class KargoSirketi {

    private IlEnum enumIl;
    private KargoSirketi sonrakiKargoSirketi;

    public KargoSirketi(IlEnum enumIl) {
        this.enumIl = enumIl;
    }

    public IlEnum getEnumIl() {
        return enumIl;
    }

    public KargoSirketi getSonrakiKargoSirketi() {
        return sonrakiKargoSirketi;
    }

    public KargoSirketi setSonrakiKargoSirketi(KargoSirketi sonrakiKargoSirketi) {
        this.sonrakiKargoSirketi = sonrakiKargoSirketi;
        return this;
    }

    public void kargola(IlEnum il) {

        kargoDurumuYazdir(il);

        if (getEnumIl().equals(il)) {
            teslimDurumuYazdir();
        } else if (getSonrakiKargoSirketi() != null) {

            getSonrakiKargoSirketi().kargola(il);

        } else {
            hizmetAlaniDisiDurumuYazdir(il);
        }
    }

    private void hizmetAlaniDisiDurumuYazdir(IlEnum il) {
        yazdir(il.getIl() + " Hizmet alanının dışındadır.");
    }

    private void teslimDurumuYazdir() {
        yazdir(getEnumIl().getIl() + " şube teslim aldı.");
    }

    private void kargoDurumuYazdir(IlEnum il) {
        yazdir(il.getIl() + " iline gidicek kargo " + getEnumIl().getIl() + " şubesine geldi.");
    }

    public void yazdir(String il) {
        System.out.println(il);
    }
}
