package com.zhrsh.texteditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        editor.printMsg("tuliskan teks yang inging ditambahkan dan enter newline untuk simpan, command (/undo, /redo, /exit):");

        while (true) {
            System.out.print(editor.getCurrentText());
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("/exit")) {
                break;
            } else if (command.equalsIgnoreCase("/undo")) {
                editor.undo();
            } else if (command.equalsIgnoreCase("/redo")) {
                editor.redo();
            } else if (!command.trim().isEmpty()) { // check jika input tdk kosong
                editor.addText(command); // tambah teks secara langsung
            } else {
                editor.printMsg("input kosong.");
            }
        }

        scanner.close();
    }
}
