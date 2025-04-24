/* Copyright (c) 2025 Zahra A. S. */

package com.zhrsh.texteditor;

import java.util.Stack;

/**
 * Kelas TextEditor menyediakan fungsionalitas utk mengedit teks dengan kemampuan
 * utk menambahkan teks, melakukan undo, dan redo. Kelas ini menggunakan dua stack
 * utk menyimpan kondisi teks sebelumnya dan yang telah di-undo.
 */
public class TextEditor {
    private String currentText;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    /**
     * Constructor utk kelas TextEditor. Menginisialisasi teks saat ini sebagai string kosong
     * dan membuat stack utk undo dan redo.
     */
    public TextEditor() {
        this.currentText = "";
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * Menambahkan teks baru ke teks saat ini. Metode ini menyimpan kondisi saat ini ke dalam
     * undo stack sebelum menambahkan teks baru dan mengosongkan redo stack.
     *
     * @param newText Teks baru yang akan ditambahkan ke teks saat ini.
     */
    public void addText(String newText) {
        // simpan kondisi saat ini ke dalam undo stack sebelum menambahkan teks baru
        undoStack.push(currentText);
        // kosongkan redo stack karena kita telah melakukan perubahan baru
        redoStack.clear();
        currentText += newText;
        Color.printYellowln("teks saat ini: \"" + currentText + "\"");
    }

    /**
     * Mengembalikan teks ke kondisi sebelumnya. Metode ini menyimpan kondisi saat ini ke dalam
     * redo stack sebelum melakukan undo. Jika tidak ada yang dapat di-undo, akan print pesan
     * bahwa tidak ada yang dapat di-undo.
     */
    public void undo() {
        if (!undoStack.isEmpty()) {
            // simpan kondisi saat ini ke dalam redo stack sebelum melakukan undo
            redoStack.push(currentText);
            // kembalikan ke kondisi sebelumnya
            currentText = undoStack.pop();
            Color.printYellowln("undo: \"" + currentText + "\"");
        } else {
            Color.printRedln("nothing to undo.");
        }
    }

    /**
     * Mengembalikan teks ke kondisi yang telah di-undo. Metode ini menyimpan kondisi saat ini ke dalam
     * undo stack sebelum melakukan redo. Jika tidak ada yang dapat di-redo, akan print pesan
     * bahwa tidak ada yang dapat di-redo.
     */
    public void redo() {
        if (!redoStack.isEmpty()) {
            // simpan kondisi saat ini ke dalam undo stack sebelum melakukan redo
            undoStack.push(currentText);
            // kembalikan ke kondisi yang telah di-undo
            currentText = redoStack.pop();
            Color.printYellowln("redo: \"" + currentText + "\"");
        } else {
            Color.printRedln("nothing to redo.");
        }
    }

    /**
     * Return teks saat ini (digunakan utk IO).
     *
     * @return Teks saat ini yang sedang diedit.
     */
    public String getCurrentText() {
        return this.currentText;
    }
}
