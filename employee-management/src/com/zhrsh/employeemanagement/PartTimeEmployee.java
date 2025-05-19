package com.zhrsh.employeemanagement;

// subclass / child class untuk Pegawai Paruh Waktu
public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // POLYMORPHISM
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // POLYMORPHISM
    // method getter tipe pegawai, akan di-override dgn child class
    @Override
    public String getType() {
        return "pegawai paruh waktu";
    }
}