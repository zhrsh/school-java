package com.zhrsh.texteditor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("tuliskan teks yang inging ditambahkan dan enter newline untuk simpan, command (/undo, /redo, /exit):");

        while (true) {
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("/exit")) {
                break;
            } else if (command.equalsIgnoreCase("/undo")) {
                editor.undo();
            } else if (command.equalsIgnoreCase("/redo")) {
                editor.redo();
            } else if (!command.trim().isEmpty()) { // Check if the input is not empty
                editor.addText(command); // Add the text directly
            } else {
                System.out.println("perintah tidak dikenali. gunakan teks untuk ditambahkan, '/undo', '/redo', atau '/exit'.");
            }
        }

        scanner.close();
    }
}
