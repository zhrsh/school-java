/**
 * kelas Mahasiswa merepresentasikan data mahasiswa dengan atribut NIM dan nama.
 * berisi metode getter.
 */
public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", nama: " + nama;
    }
}
