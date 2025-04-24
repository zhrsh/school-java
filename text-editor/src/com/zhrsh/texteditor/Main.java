package com.zhrsh.texteditor;

import java.util.Scanner;

public class Main {
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
