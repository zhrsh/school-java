package com.zhrsh.queue;

import java.util.Scanner;

/**
 * Kelas Main adalah titik masuk untuk program Queue Sederhana.
 * Program ini memungkinkan pengguna untuk mengelola antrian/queue
 * dengan berbagai command seperti menambah, menghapus, menghitung,
 * melihat, dan memeriksa item di dalam queue.
 * @author Zahra A. S.
 */
public class Main {
    
    /**
     * Metode utama yang menjalankan program.
     * Menginisialisasi QueueManager dan Scanner untuk menerima input dari pengguna.
     * Menyediakan interface pengguna berbasis teks untuk mengelola queue.
     *
     * @param args argumen baris command (tidak digunakan)
     */
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("\nPROGRAM QUEUE SEDERHANA");
        helpMsg();
        
        while (true) {
            System.out.print("\ncommand: ");
            command = scanner.nextLine();

            if (command.startsWith("/add ")) {
                String item = commandWithArg(command, "/add ");
                queueManager.enqueue(item);
                System.out.println("item '" + item + "' telah ditambahkan ke queue.");
            } else if (command.equalsIgnoreCase("/del")) {
                String removedItem = queueManager.dequeue();
                if (removedItem != null) {
                    System.out.println("item '" + removedItem + "' telah dihapus dari queue.");
                } else {
                    System.out.println("queue kosong, tidak ada item yang dihapus.");
                }
            } else if (command.equalsIgnoreCase("/count")) {
                int count = queueManager.countItems();
                System.out.println("jumlah item dalam queue: " + count);
            } else if (command.equalsIgnoreCase("/view")) {
                System.out.println("isi queue: " + queueManager.displayQueue());
            } else if (command.equalsIgnoreCase("/peek")) {
                System.out.println("element di depan queue: " + queueManager.peekQueue());
            } else if (command.equalsIgnoreCase("/help")) {
                helpMsg();
            } else if (command.equalsIgnoreCase("/exit")) {
                System.out.println("\nexiting program...");
                scanner.close();
                break;
            } else {
                System.out.println("input tidak sesuai.");
            }
        }
    }

    /**
     * Print message bantuan yang menjelaskan command-command yang tersedia.
     */
    public static void helpMsg() {
        System.out.println("\ncommand yang bisa digunakan:");
        System.out.println("1. '/add <ITEM>' untuk tambah item ke belakang queue.");
        System.out.println("2. '/del' untuk hapus item dari depan queue.");
        System.out.println("3. '/count' untuk hitung jumlah item dalam queue.");
        System.out.println("4. '/view' untuk tampilkan queue.");
        System.out.println("5. '/peek' untuk peek item di depan queue.");
        System.out.println("6. '/help' untuk menampilkan message ini.");
        System.out.println("7. '/exit' untuk exit.");
    }
    
    /**
     * Mengambil argumen dari input command.
     *
     * @param input string input yang berisi command
     * @param command string command yang akan dihapus dari input
     * @return argumen yang diambil dari input
     */
    public static String commandWithArg(String input, String command) {
        String arg = input.substring(command.length()).trim(); // remove the command part
        return arg;
    }
}
