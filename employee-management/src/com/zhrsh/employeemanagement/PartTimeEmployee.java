package com.zhrsh.employeemanagement;

// subclass / child class untuk Pegawai Paruh Waktu
public class PartTimeEmployee extends Employee {
    private double hourlySalary;
    private int hoursWorked;

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