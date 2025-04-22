/**
 * Main.java - program database mahasiswa
 * tugas zahra a. s.
 */
package com.zhrsh.database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int count = 0;

        while (true) {
            System.out.println("\n=== DATABASE MAHASISWA ===");
            System.out.println("[1] push data mahasiswa");
            System.out.println("[2] tampilkan semua data mahasiswa");
            System.out.println("[3] pop semua data mahasiswa");
            System.out.println("[any other key] keluar");
            System.out.print("\npilih langkah: ");
            String input = scanner.nextLine(); // read the entire line

            if (!input.isEmpty()) {
                char choice = input.charAt(0); // get the first character
                switch (choice) {
                    case '1':
                        if (count >= 5) {
                            System.out.println("\njumlah data maksimal sudah tercapai.");
                            break;
                        }
                        System.out.print("\nmasukkan nim (maks 10 angka): ");
                        String nim = scanner.nextLine();
                        if (nim.length() > 10 || !nim.matches("\\d+")) {
                            System.out.println("\nnim tidak valid.");
                            break;
                        }
    
                        System.out.print("masukkan nama (maks 30 karakter): ");
                        String nama = scanner.nextLine();
                        if (nama.length() > 30) {
                            System.out.println("\nnama tidak valid.");
                            break;
                        }
    
                        System.out.print("masukkan jurusan (maks 50 karakter): ");
                        String jurusan = scanner.nextLine();
                        if (jurusan.length() > 50) {
                            System.out.println("\njurusan tidak valid.");
                            break;
                        }
    
                        list.push(nim, nama, jurusan);
                        count++;
                        System.out.println("\ndata mahasiswa berhasil ditambahkan.");
                        break;
    
                    case '2':
                        System.out.println("\ndaftar mahasiswa:");
                        list.display();
                        break;
    
                    case '3':
                        list.pop();
                        count = 0; // reset count after popping
                        break;
    
                    default:
                        System.out.println("\nexiting program...");
                        scanner.close();
                        return;
                }
            } 
            
            else {
                System.out.println("No input provided.");
            }
        }
    }
}