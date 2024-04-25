package com.umiitkose.behavioral.memento.notepad;

public class NotepadMemento {

    private String metin;

    public NotepadMemento() {
        metin = "";
    }

    public NotepadMemento(String metin) {
        this.metin = metin;
    }

    public String getMetin() {
        return metin;
    }
}
