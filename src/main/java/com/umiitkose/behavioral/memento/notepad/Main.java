package com.umiitkose.behavioral.memento.notepad;

public class Main {
    public static void main(String[] args) {
        Hafiza hafiza = new Hafiza();

        Notepad notepad = new Notepad();

        notepad.ekle("A");
        notepad.ekle("B");
        notepad.ekle("C");
        notepad.ekle("D");
        notepad.ekle("E");

        versiyonKaydet(hafiza, notepad);

        notepad.ekle("DIR");

        versiyonKaydet(hafiza, notepad);

        notepad.ekle(".");

        notepad.yazdir();

        notepad.geriDon(hafiza.sonVersiyonuGetir());

        versiyonKaydet(hafiza, notepad);



    }

    private static void versiyonKaydet(Hafiza hafiza, Notepad notepad) {
        NotepadMemento notepadMemento = notepad.kaydet();

        hafiza.ekle(notepadMemento);

        notepad.yazdir();
    }
}
