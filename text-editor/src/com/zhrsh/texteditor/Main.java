package com.zhrsh.texteditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("masukkan perintah (add, undo, redo, exit):");

        while (true) {
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            } else if (command.startsWith("add ")) {
                String textToAdd = command.substring(4); // Mengambil teks setelah "add "
                editor.addText(textToAdd);
            } else if (command.equalsIgnoreCase("undo")) {
                editor.undo();
            } else if (command.equalsIgnoreCase("redo")) {
                editor.redo();
            } else {
                System.out.println("perintah tidak dikenali. Gunakan 'add <teks>', 'undo', 'redo', atau 'exit'.");
            }
        }

        scanner.close();
    }
}
