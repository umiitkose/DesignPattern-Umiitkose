package com.umiitkose.behavioral.memento.notepad;


public class Notepad {

    private String metin;

    public Notepad() {
        metin = "";
    }

    public Notepad(String metin) {
        this.metin = metin;
    }

    public NotepadMemento kaydet() {
        return new NotepadMemento(metin);
    }

    public void ekle(String eklenecekMetin) {
        metin += eklenecekMetin;
    }

    public void geriDon(NotepadMemento memento) {
        metin = memento.getMetin();
    }

    public void yazdir() {
        System.out.println(metin);
    }
}
