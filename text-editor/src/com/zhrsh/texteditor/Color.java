package com.zhrsh.texteditor;

public class Color {
    public static void printRedln(String message) {
        System.out.println("\033[31m" + message + "\033[0m");
    }

    public static void printYellowln(String message) {
        System.out.println("\033[93m" + message + "\033[0m");
    }

    public static void printYellow(String message) {
        System.out.print("\033[93m" + message + "\033[0m");
    }

    public static void printGrey(String message) {
        System.out.print("\033[90m" + message + "\033[0m");
    }
}
