/**
 * Mahaiswa.java - program database mahasiswa
 * tugas zahra a. s.
 */
package database;
/**
 * Kelas Mahasiswa merepresentasikan data mahasiswa dengan atribut NIM, nama, jurusan,
 * dan referensi ke mahasiswa berikutnya dalam linked list. (Node linked list)
 */
public class Mahasiswa {
    String nim;
    String nama;
    String jurusan;
    Mahasiswa next;
    
	/**
     * Konstruktor untuk membuat objek Mahasiswa dengan NIM, nama, dan jurusan yang diberikan.
     *
     * @param nim NIM mahasiswa
     * @param nama Nama mahasiswa
     * @param jurusan Jurusan mahasiswa
     */
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.next = null;
    }
}