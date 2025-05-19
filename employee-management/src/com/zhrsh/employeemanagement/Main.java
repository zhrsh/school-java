package com.zhrsh.employeemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * kelas Main adalah kelas utama untuk menjalankan program.
 * kelas ini mengelola data pegawai dan interface pengguna.
 * @author Zahra A. S.
 */
public class Main {
    private static List<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
    private static List<PartTimeEmployee> partTimeEmployees = new ArrayList<>();

    // main method untuk menjalankan program
    public static void main(String[] args) {
        // data default sesuai contoh
        // new instance kelas (objek) pegawai tetap, terus masukkan kedalam ArrayList fullTimeEmployees
        fullTimeEmployees.add(new FullTimeEmployee("Andi", 5000000));
        // new instance kelas (objek) pegawai paruh waktu, terus masukkan kedalam ArrayList partTimeEmployees
        partTimeEmployees.add(new PartTimeEmployee("Budi", 200000, 20));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== DATABASE PEGAWAI ===");
            System.out.println("[1] tambahkan data pegawai tetap");
            System.out.println("[2] tambahkan data pegawai paruh waktu");
            System.out.println("[3] tampilkan data pegawai");
            System.out.println("[any other key] keluar");
            System.out.print("\nchoice: ");
            String input = scanner.nextLine(); // read the entire line

            if (!input.isEmpty()) {
                char choice = input.charAt(0); // get the first character
                switch (choice) {
                    case '1':
                        addFTEmployee(scanner);
                        break;
                    case '2':
                        addPTEmployee(scanner);
                        break;
                    case '3':
                        displayEmployees();
                        break;
                    default:
                        System.out.println("\nexiting program...");
                        scanner.close();
                        return;
                }
            } else {
                System.out.println("tidak ada input yang diberikan.");
            }
        }
    }

    private static void addFTEmployee(Scanner scanner) {
        System.out.print("masukkan nama pegawai tetap: ");
        String name = scanner.nextLine();
        System.out.print("masukkan gaji pegawai tetap: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        fullTimeEmployees.add(new FullTimeEmployee(name, salary));
        System.out.println("pegawai tetap berhasil ditambahkan.");
    }
    
    private static void addPTEmployee(Scanner scanner) {
        System.out.print("masukkan nama pegawai paruh waktu: ");
        String name = scanner.nextLine();
        System.out.print("masukkan upah per jam pegawai paruh waktu: ");
        double hourlyWage = scanner.nextDouble();
        System.out.print("masukkan jam kerja pegawai paruh waktu: ");
        int hoursWorked = scanner.nextInt();
        scanner.nextLine();
        partTimeEmployees.add(new PartTimeEmployee(name, hourlyWage, hoursWorked));
        System.out.println("pegawai paruh waktu berhasil ditambahkan.");
    }

    private static void displayEmployees() {
        System.out.println("\n--- PEGAWAI TETAP ---");
        for (FullTimeEmployee employee : fullTimeEmployees) {
            System.out.println(employee.toString());
        }

        System.out.println("\n--- PEGAWAI PARUH WAKTU ---");
        for (PartTimeEmployee employee : partTimeEmployees) {
            System.out.println(employee.toString());
        }
    }
}
