package com.zhrsh.hashtable;
/**
 * kelas Mahasiswa merepresentasikan data mahasiswa dengan atribut NIM dan nama.
 * berisi metode getter.
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private double ipk;

    public Mahasiswa(String nim, String nama, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", nama: " + nama + ", IPK: " + ipk;
    }
}
