/* Copyright (c) 2025 Zahra A. S. */

package com.zhrsh.texteditor;

import java.util.Scanner;

/**
 * Kelas Main adalah titik masuk utk program texteditor. Kelas ini mengelola interaksi pengguna
 * dan mengontrol alur program.
 * @author Zahra A. S.
 */
public class Main {
    /**
     * Metode utama yang menjalankan program texteditor. Mengelola input pengguna utk menambahkan teks,
     * melakukan undo, redo, dan menyimpan teks ke dalam file.
     */
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;
        String exit; // yes or no ketika user exit

        helpMsg();

        while (true) {
            Color.printGrey(editor.getCurrentText());
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("/exit")) {
                Color.printYellow("apakah anda ingin save text sebagai file? (y/n): ");
                exit = scanner.nextLine();
                if (exit.equalsIgnoreCase("y")) {
                    Color.printYellow("masukkan nama file yang akan di save (.txt): ");
                    String filename = scanner.nextLine();
                    FileIO.saveToFile(editor.getCurrentText(), filename);
                }
                break;
            } else if (command.equalsIgnoreCase("/undo")) {
                editor.undo();
            } else if (command.equalsIgnoreCase("/redo")) {
                editor.redo();
            } else if (command.equalsIgnoreCase("/help")) {
                helpMsg();
            } else if (!command.trim().isEmpty()) { // check jika input tdk kosong
                editor.addText(command); // tambah teks secara langsung
            } else {
                Color.printRedln("input kosong.");
            }
        }

        scanner.close();
    }

    public static void helpMsg() {
        Color.printYellowln("SIMPLE TEXT EDITOR\nwrite the text and press enter to add to the stack.\n");
        Color.printYellowln("available commands:");
        Color.printYellowln("1. '/undo' - reverts the last action you performed in the editor.");
        Color.printYellowln("2. '/redo' - reapplies the last action that was undone.");
        Color.printYellowln("3. '/help' - show this message.");
        Color.printYellowln("4. '/exit' - exit program and optionally save.");
        Color.printYellowln("5. [Text] - add the specified text directly to the editor.");
        Color.printYellowln("   (replace [Text] with your desired input then press enter.)");
    }
}