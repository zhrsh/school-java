package com.zhrsh.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueManager queueManager = new QueueManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n== PROGRAM QUEUE SEDERHANA ==");
            System.out.println("[1] tambah item ke belakang queue");
            System.out.println("[2] hapus item dari depan queue");
            System.out.println("[3] hitung jumlah item dalam queue");
            System.out.println("[4] tampilkan queue");
            System.out.println("[5] peek item di depan queue");
            System.out.println("[any other key] exit");
            System.out.print("\npilih opsi: ");

            String input = scanner.nextLine(); // read the entire line

            if (!input.isEmpty()) {
                char choice = input.charAt(0); // get the first character
                switch (choice) {
                    case '1':
                    System.out.print("masukkan item untuk ditambahkan: ");
                    String item = scanner.nextLine();
                    queueManager.enqueue(item);
                    System.out.println("item '" + item + "' telah ditambahkan ke queue.");
                    break;
                case '2':
                    String removedItem = queueManager.dequeue();
                    if (removedItem != null) {
                        System.out.println("item '" + removedItem + "' telah dihapus dari queue.");
                    } else {
                        System.out.println("queue kosong, tidak ada item yang dihapus.");
                    }
                    break;
                case '3':
                    int count = queueManager.countItems();
                    System.out.println("jumlah item dalam queue: " + count);
                    break;
                case '4':
                    System.out.println("isi queue: " + queueManager.displayQueue());
                    break;
                case '5':
                    System.out.println("element di depan queue: " + queueManager.peekQueue());
                    break;
                default:
                    System.out.println("\nexiting program...");
                    scanner.close();
                    return;
                }
            } 
            
            else {
                System.out.println("no input provided.");
            }

        }
    }
}
