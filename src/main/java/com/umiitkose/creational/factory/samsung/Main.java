package com.umiitkose.creational.factory.samsung;

public class Main {

    public static void main(String[] args) {
        // Note20 için :
        Note eskiYontemNote20 = new Note20();
        System.out.println(eskiYontemNote20);

        // Note10 için :
        Note eskiYontemNote10 = new Note10();
        System.out.println(eskiYontemNote10);


        Note note20 = NoteFactoryImp.createNote(SamsungNoteType.NOTE_20);
        System.out.println(note20);
        System.out.println(NoteFactoryImp.createNote(SamsungNoteType.NOTE_10));
        
    }
}
