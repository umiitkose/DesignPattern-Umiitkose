package com.umiitkose.creational.factory.samsung;

public class NoteFactoryImp {

    public static Note createNote(SamsungNoteType samsungNoteType) {
        if (samsungNoteType == SamsungNoteType.NOTE_10)
            return new Note20();
        else
            return new Note10();

    }



}


