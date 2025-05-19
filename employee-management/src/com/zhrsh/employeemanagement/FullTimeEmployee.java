package com.zhrsh.employeemanagement;

// subclass / child class untuk Pegawai Tetap
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        if (monthlySalary < 0) {
            throw new IllegalArgumentException("salary tidak bisa negative");
        }
        this.monthlySalary = monthlySalary;
    }

    // POLYMORPHISM
    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // POLYMORPHISM
    // method getter tipe pegawai tetap
    @Override
    public String getType() {
        return "pegawai tetap";
    }
}