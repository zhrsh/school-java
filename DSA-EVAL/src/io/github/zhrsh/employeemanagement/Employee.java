package io.github.zhrsh.employeemanagement;

/**
 * kelas Employee adalah kelas dasar (superclass) untuk semua jenis pegawai.
 * kelas ini menyimpan informasi dasar pegawai seperti nama dan 
 * menyediakan metode untuk menghitung gaji dan mendapatkan tipe pegawai.
 * @author Zahra A. S.
 */
public class Employee {
    protected String name;

    // constructor
    public Employee(String name) {
        this.name = name;
    }

    // method utk menghitung gaji, akan di-override dgn child class
    public double calculateSalary() {
        return 0.0;
    }

    // method getter tipe pegawai, akan di-override dgn child class
    public String getType() {
        return "pegawai";
    }

    public String getName() {
        return name;
    }

    // POLYMORPHISM (implementasi khusus .toString() dalam objek java)
    @Override
    public String toString() {
        return "gaji " + getType() + " " + name + ": Rp" + calculateSalary();
    }
}

