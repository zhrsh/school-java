package com.zhrsh.hashtable;
import java.util.Scanner;

/**
 * kelas Main adalah titik masuk program yang menyediakan interface pengguna untuk
 * menambahkan, mencari, dan menghapus data mahasiswa dari HashTable.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashTable hashTable = new HashTable(10);

        // menambahkan data mahasiswa default
        hashTable.add(new Mahasiswa("101", "Andi", 3.5));
        hashTable.add(new Mahasiswa("102", "Natalie", 4.0));
        hashTable.add(new Mahasiswa("103", "Aulia", 3.2));
        hashTable.add(new Mahasiswa("104", "Budi", 3.0));
        hashTable.add(new Mahasiswa("105", "Lizzie", 3.9));

        while (true) {
            System.out.println("\n=== DATABASE MAHASISWA ===");
            System.out.println("[1] tambahkan data mahasiswa");
            System.out.println("[2] cari data mahasiswa");
            System.out.println("[3] hapus data mahasiswa");
            System.out.println("[any other key] keluar");
            System.out.print("\npilih langkah: ");
            String input = scanner.nextLine(); // read the entire line

            if (!input.isEmpty()) {
                char choice = input.charAt(0); // get the first character
                switch (choice) {

                    case '1':
                        System.out.print("masukkan NIM: ");
                        String nim = scanner.nextLine();
                        System.out.print("masukkan nama: ");
                        String nama = scanner.nextLine();
                        System.out.print("masukkan IPK: ");
                        double ipk = Double.parseDouble(scanner.nextLine());
                        boolean success = hashTable.add(new Mahasiswa(nim, nama, ipk));
                        if (success == true) {
                            System.out.println("data mahasiswa telah ditambahkan.");
                        }
                        break;

                    case '2':
                        System.out.print("masukkan NIM yang dicari: ");
                        String searchNim = scanner.nextLine();
                        Mahasiswa m = hashTable.search(searchNim);
                        if (m != null) {
                            System.out.println("data ditemukan: " + m);
                        } else {
                            System.out.println("data tidak ditemukan.");
                        }
                        break;

                    case '3':
                        System.out.print("masukkan NIM yang ingin dihapus: ");
                        String removeNim = scanner.nextLine();
                        boolean isRemoved = hashTable.remove(removeNim);
                        if (isRemoved) {
                            System.out.println("data mahasiswa dengan NIM " + removeNim + " telah dihapus.");
                        } else {
                            System.out.println("data mahasiswa dengan NIM " + removeNim + " tidak ditemukan.");
                        }
                        break;

                    default:
                        System.out.println("\nkeluar dari program...");
                        scanner.close();
                        return;
                }
            } else {
                System.out.println("tidak ada input yang diberikan.");
            }
        }
    }
}