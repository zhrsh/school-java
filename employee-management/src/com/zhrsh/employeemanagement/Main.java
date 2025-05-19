package com.zhrsh.employeemanagement;

// main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // new instance kelas (objek) pegawai tetap
        FullTimeEmployee employeeFT1 = new FullTimeEmployee("Andi", 5000000);
        // new instance kelas (objek) pegawai paruh waktu
        PartTimeEmployee employeePT1 = new PartTimeEmployee("Budi", 200000, 20);

        // menampilkan gaji pegawai
        System.out.println(employeeFT1.toString());
        System.out.println(employeePT1.toString());
    }
}
