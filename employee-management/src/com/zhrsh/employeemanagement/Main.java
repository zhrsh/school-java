package com.zhrsh.employeemanagement;

// main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // new instance kelas (objek) pegawai tetap
        FullTimeEmployee employeeFT = new FullTimeEmployee("Andi", 5000000);
        // new instance kelas (objek) pegawai paruh waktu
        PartTimeEmployee employeePT = new PartTimeEmployee("Budi", 200000, 20);

        // menampilkan gaji pegawai
        System.out.println("gaji " + employeeFT.getType() + " " + employeeFT.getName() + ": Rp" + employeeFT.calculateSalary());
        System.out.println("gaji " + employeeFT.getType() + " " + employeePT.getName() + ": Rp" + employeePT.calculateSalary());
    }
}
