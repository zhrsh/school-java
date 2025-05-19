package com.zhrsh.employeemanagement;

// main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // new instance kelas (objek) pegawai tetap
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Andi", 5000000);
        // new instance kelas (objek) pegawai paruh waktu
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Budi", 200000, 20);

        // menampilkan gaji pegawai
        System.out.println("gaji pegawai tetap " + fullTimeEmployee.getName() + ": Rp" + fullTimeEmployee.calculateSalary());
        System.out.println("gaji pegawai paruh waktu " + partTimeEmployee.getName() + ": Rp" + partTimeEmployee.calculateSalary());
    }
}
