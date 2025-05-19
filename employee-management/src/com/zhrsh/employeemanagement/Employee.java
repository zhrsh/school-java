package com.zhrsh.employeemanagement;

// superclass / parent class
public class Employee {
    protected String name;

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

    @Override
    public String toString() {
        return "gaji " + getType() + " " + name + ": Rp" + calculateSalary();
    }
}

