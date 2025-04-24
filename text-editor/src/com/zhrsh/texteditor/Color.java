/* Copyright (c) 2025 Zahra A. S. */

package com.zhrsh.texteditor;

/**
 * Kelas Color menyediakan metode untuk print pesan ke konsol dengan warna yang berbeda.
 * Kelas ini menggunakan kode ANSI untuk mengubah warna teks yang print.
 */
public class Color {
    /**
     * Print pesan dengan warna merah diikuti dengan newline.
     *
     * @param message Pesan yang akan print.
     */
    public static void printRedln(String message) {
        System.out.println("\033[31m" + message + "\033[0m");
    }

    /**
     * Print pesan dengan warna kuning diikuti dengan newline.
     *
     * @param message Pesan yang akan print.
     */
    public static void printYellowln(String message) {
        System.out.println("\033[93m" + message + "\033[0m");
    }

    /**
     * Print pesan dengan warna kuning tanpa newline.
     *
     * @param message Pesan yang akan print.
     */
    public static void printYellow(String message) {
        System.out.print("\033[93m" + message + "\033[0m");
    }

    /**
     * Print pesan dengan warna abu-abu tanpa newline.
     *
     * @param message Pesan yang akan print.
     */
    public static void printGrey(String message) {
        System.out.print("\033[90m" + message + "\033[0m");
    }
}
