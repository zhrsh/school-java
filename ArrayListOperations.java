/**
 * Tugas DSAA LAB Zahra A.S. (REMOVED)
 * ArrayListOperations.java
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class ini menyediakan operasi dasar untuk ArrayList yang menyimpan nilai integer.
 */
public class ArrayListOperations {
    private ArrayList<Integer> arrayList;

    /**
     * Constructor untuk instance ArrayListOperations dengan ArrayList kosong.
     */
    public ArrayListOperations() {
        arrayList = new ArrayList<>();
    }

    /**
     * Print pesan dengan format untuk ArrayList
     * pesan akan di print dengan warna biru (\u001B[34m, dan \u001B[0m untuk reset)
     *
     * @param message Pesan yang akan diprint.
     */
    public void arraylistPrintln(String message) {
        System.out.println("\u001B[34m" + "ArrayList - " + message + "\u001B[0m");
    }

    /**
     * Menambahkan satu atau lebih nilai ke dalam ArrayList
     *
     * @param output Jika true, print pesan setiap kali nilai ditambahkan.
     * @param values Nilai-nilai yang akan ditambahkan ke dalam ArrayList.
     */
    public void add(boolean output, int... values) {
        for (int value : values) {
            arrayList.add(value);
            if (output == true) {
                arraylistPrintln("penambahan: nilai " + value + " telah ditambahkan");
            }
        }
    }

    /**
     * Melakukan traversal dan print isi dari ArrayList.
     */
    public void traversal() {
        arraylistPrintln("traversal: " + arrayList);
    }

    /**
     * Mencari nilai dalam ArrayList menggunakan pencarian linear.
     *
     * @param value Nilai yang akan dicari.
     * @return Index dari nilai yang ditemukan, atau -1 jika tidak ditemukan.
     */
    public int pencarianLinear(int value) {
        int index = arrayList.indexOf(value);
        
        if (index == -1) {
            arraylistPrintln("pencarian linear: nilai " + value + " tidak ditemukan.");
        } else {
            arraylistPrintln("pencarian linear: nilai " + value + " ditemukan pada index ke-" + index);
        }
        
        return index;
    }

    /**
     * Menghapus nilai dari ArrayList.
     *
     * @param value Nilai yang akan dihapus dari ArrayList (bukan index).
     */
    public void delete(int value) {
        if (!arrayList.remove(Integer.valueOf(value))) {
            arraylistPrintln("nilai tidak ditemukan untuk dihapus.");
        } else {
            arraylistPrintln("penghapusan: nilai " + value +  " telah dihapus");
        }
    }

    /**
     * Mengurutkan nilai-nilai dalam ArrayList dengan metode Collections.sort()
     */
    public void sort() {
        Collections.sort(arrayList);
        arraylistPrintln("arraylist telah di urutkan menjadi: " + arrayList);
    }
}
