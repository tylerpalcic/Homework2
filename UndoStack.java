package com.example.tylerpalcic.homework2;

public class UndoStack {
    private static final UndoStack ourInstance = new UndoStack();

    public static UndoStack getInstance() {
        return ourInstance;
    }

    private UndoStack() {

    }
}
