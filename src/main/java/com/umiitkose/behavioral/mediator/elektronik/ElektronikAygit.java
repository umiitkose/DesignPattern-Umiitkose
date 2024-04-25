package com.umiitkose.behavioral.mediator.elektronik;

public abstract class ElektronikAygit {

    protected Arabulucu arabulucu;

    public ElektronikAygit(Arabulucu arabulucu) {
        this.arabulucu = arabulucu;
    }

    public abstract void calistir();

    public abstract void durdur();

}
