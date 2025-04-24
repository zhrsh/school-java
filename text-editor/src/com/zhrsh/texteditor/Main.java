package com.zhrsh.texteditor;

import java.util.Scanner;

/**
 * Kelas Main adalah titik masuk utk program texteditor. Kelas ini mengelola interaksi pengguna
 * dan mengontrol alur program.
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

        Color.printYellowln("tuliskan teks yang inging ditambahkan dan enter newline untuk simpan, command (/undo, /redo, /exit):");

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
            } else if (!command.trim().isEmpty()) { // check jika input tdk kosong
                editor.addText(command); // tambah teks secara langsung
            } else {
                Color.printRedln("input kosong.");
            }
        }

        scanner.close();
    }
}