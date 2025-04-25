/**
 * ArrayOperations.java
 * tugas zahra a. s.
 */
package com.zhrsh.arraycomp;
import java.util.Arrays;

/**
 * Class ini menyediakan operasi dasar untuk Array yang menyimpan nilai integer.
 * @author Zahra A. S.
 */
public class ArrayOperations {
    private int[] array;
    private int size;

    /**
     * Constructor untuk instance ArrayOperations
     *
     * @param newArray array yang akan digunakan untuk operasi.
     */
    public ArrayOperations(int[] newArray) {
        this.array = newArray;
        this.size = newArray.length;
    }

    /**
     * Print pesan dengan format untuk kelas ArrayOperations
     * Pesan akan di print dengan warna kuning (\u001B[33m, dan \u001B[0m untuk reset)
     * 
     * @param message pesan yang akan diprint.
     */
    public void arrayPrintln(String message) {
        System.out.println("\u001B[33m" + "Array - " + message + "\u001B[0m");
    }

    /**
     * Print pesan tanpa newline dengan format untuk Array
     *
     * @param message pesan yang akan di print.
     */
    public void arrayPrint(String message) {
        System.out.print("\u001B[33m" + message + "\u001B[0m");
    }

    /**
     * Menggunakan for loop unutk menampilkan element dalam array secara traversal (loop)
     * traversal: mengiterasi dan mengakses element satu per satu 
     */
    public void traversal() {
        arrayPrint("Array - traversal: [");
        for (int i = 0; i < size; i++) {
            // utk element terakhir
            if (i == (size - 1)) {
                arrayPrint(array[i] + "]\n");
            // utk element selain terakhir
            } else {
                arrayPrint(array[i] + ", ");
            }
        }
    }

    /**
     * Melakukan pencarian linear untuk menemukan indeks dari nilai yang dicari.
     *
     * @param intToSearch nilai yang akan dicari dalam array.
     * @param output jika true, akan print hasil pencarian.
     * @return indeks dari nilai yang ditemukan, atau -1 jika tidak ditemukan.
     */
    public int pencarianLinear(int intToSearch, boolean output) {
        // linear search
        for (int i = 0; i < size; i++) {
            if (array[i] == intToSearch) {
                // output bisa dimatikan jika dipanggil metode lain
                if (output == true) {
                    arrayPrintln("pencarian linear: angka '" + intToSearch + "' ditemukan di index ke-" + i);
                }
                return i;
            }
        }
        if (output == true) {
            arrayPrintln("pencarian linear: angka '" + intToSearch + "' tidak ditemukan.");
        }
        return -1; // return -1 jika tdk ditemukan
    }

    /**
     * Melakukan pencarian biner untuk menemukan indeks dari nilai yang dicari.
     * Array akan copy dan di sort sebelum pencarian dilakukan.
     *
     * @param intToSearch nilai yang akan dicari dalam array.
     * @return indeks dari nilai yang ditemukan dalam array asli, atau -1 jika tidak ditemukan.
     */
    public int pencarianBinary(int intToSearch) {
        int[] sortedArray = Arrays.copyOf(array, size);
        Arrays.sort(sortedArray); // sort array yg telah di copy
        int result = Arrays.binarySearch(sortedArray, intToSearch); // binary search utk sorted copy
        if (result >= 0) {
            // cari original index dalam unsorted array
            for (int i = 0; i < size; i++) {
                if (array[i] == intToSearch) {
                    arrayPrintln("pencarian biner: angka '" + intToSearch + "' ditemukan di index ke-" + i);
                    return i;
                }
            }
        }
        arrayPrintln("pencarian biner: angka '" + intToSearch + "' tidak ditemukan.");
        return -1; // akan return -1 jika tdk ditemukan
    }

    /**
     * Menyisipkan nilai baru ke dalam array pada indeks yang ditentukan.
     * Jika array penuh, ukuran array akan di resize.
     *
     * @param index indeks di mana nilai baru akan disisipkan.
     * @param value nilai yang akan disisipkan ke dalam array.
     */
    public void insert(int index, int value) {
        if (size >= array.length) {
            // resize array jika penuh
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        if (index < 0 || index > size) {
            arrayPrintln("index tidak valid.");
            return;
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        arrayPrintln("penambahan: nilai " + value + " telah ditambahkan");
    }

    /**
     * Menghapus nilai dari array. Jika nilai ditemukan, elemen setelahnya akan digeser ke kiri.
     *
     * @param value nilai yang akan dihapus dari array.
     */
    public void delete(int value) {
        int index = pencarianLinear(value, false);
        if (index != -1) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            size--;
            arrayPrintln("penghapusan: nilai '" + value + "' telah dihapus.");
        } else {
            arrayPrintln("penghapusan: nilai '" + value + "' tidak ditemukan untuk dihapus.");
        }
    }
}