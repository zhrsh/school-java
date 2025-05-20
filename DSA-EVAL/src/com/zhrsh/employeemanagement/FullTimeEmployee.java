package com.zhrsh.employeemanagement;

/**
 * kelas FullTimeEmployee adalah subclass dari Employee yang 
 * merepresentasikan pegawai tetap.
 * @author Zahra A. S.
 */
public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // constructor (dengan pengecekan argument)
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