package com.zhrsh.texteditor;

import java.util.Stack;

public class TextEditor {
    private String currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor() {
        this.currentText = "";
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void addText(String newText) {
        // simpan kondisi saat ini ke dalam undo stack sebelum menambahkan teks baru
        undoStack.push(currentText);
        // kosongkan redo stack karena kita telah melakukan perubahan baru
        redoStack.clear();
        currentText += newText;
        System.out.println("teks saat ini: \"" + currentText + "\"");
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            // simpan kondisi saat ini ke dalam redo stack sebelum melakukan undo
            redoStack.push(currentText);
            // kembalikan ke kondisi sebelumnya
            currentText = undoStack.pop();
            System.out.println("undo: \"" + currentText + "\"");
        } else {
            System.out.println("nothing to undo.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            // simpan kondisi saat ini ke dalam undo stack sebelum melakukan redo
            undoStack.push(currentText);
            // kembalikan ke kondisi yang telah di-undo
            currentText = redoStack.pop();
            System.out.println("redo: \"" + currentText + "\"");
        } else {
            System.out.println("nothing to redo.");
        }
    }
}
