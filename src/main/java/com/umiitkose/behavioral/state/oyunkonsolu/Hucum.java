package com.umiitkose.behavioral.state.oyunkonsolu;

public class Hucum implements Konsol {

    public Hucum() {
        System.out.println("Hücum yapılıyor");
    }

    @Override
    public void kareBas() {
        System.out.println("şut çekiliyor.");
    }

    @Override
    public void ucgenBas() {
        System.out.println("ara pas veriliyor.");
    }

    @Override
    public void yuvarlakBas() {
        System.out.println("Orta açılıyor");
    }

    @Override
    public void xBas() {
        System.out.println("Kısa pas veriliyor.");
    }
}
