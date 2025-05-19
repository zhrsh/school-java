package com.zhrsh.employeemanagement;

/**
 * kelas PartTimeEmployee adalah subclass dari Employee yang 
 * merepresentasikan pegawai paruh waktu
 * @author Zahra A. S.
 */
public class PartTimeEmployee extends Employee {
    private double hourlySalary;
    private int hoursWorked;

    // constructor (dengan pengecekan argument)
    public PartTimeEmployee(String name, double hourlySalary, int hoursWorked) {
        super(name);
        if (hourlySalary < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException("hourly rate dan hours worked tidak bisa negative");
        }
        this.hourlySalary = hourlySalary;
        this.hoursWorked = hoursWorked;
    }

    // POLYMORPHISM
    @Override
    public double calculateSalary() {
        return hourlySalary * hoursWorked;
    }

    // POLYMORPHISM
    // method getter tipe pegawai, akan di-override dgn child class
    @Override
    public String getType() {
        return "pegawai paruh waktu";
    }
}