package io.github.zhrsh.hashtable;

import java.util.LinkedList;
// import java.lang.Math;

/**
 * kelas HashTable adalah implementasi hash table menggunakan LinkedList untuk menangani
 * kolisi. kelas ini menyediakan metode untuk menyisipkan nama dan menampilkan isi hash table.
 * @author Zahra A. S.
 */
public class HashTable {
    private LinkedList<String>[] table;
    private int size;
    private boolean displayDebug; // untuk menampilkan proses hash function

    /**
     * konstruktor untuk kelas HashTable.
     *
     * @param size ukuran hash table.
     * @param displayDebug jika true, akan menampilkan informasi debug saat proses hashing.
     */
    @SuppressWarnings("unchecked")
    public HashTable(int size, boolean displayDebug) {
        this.size = size;
        this.displayDebug = displayDebug;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    /**
     * fungsi hash untuk menghitung indeks dari nama yang diberikan.
     *
     * @param name nama yang akan di-hash.
     * @return indeks hasil hashing.
     */
    private int hash(String name) {
        int hashedString = name.length(); // custom hash function sesuai diagram
        // int hashedString = Math.abs(name.hashCode()); // hash function lebih efisien

        int hashedStringRound = hashedString % size;

        // jika attribute debug bernilai true, maka metode ini akan mencetak informasi 
        // tentang proses hashing, termasuk string yang di-hash, nilai panjangnya, dan hasil 
        // akhir dari operasi modulo.
        if (displayDebug) {
            System.out.printf(
                "%-7s ->  %s  ->  %s %% %d = %s%n",
                name, hashedString, hashedString, size, hashedStringRound
            );
        }
        return hashedStringRound;
    }

    /**
     * metode untuk menyisipkan nama ke dalam hash table.
     *
     * @param name nama yang akan disisipkan.
     */
    public void insert(String name) {
        int index = hash(name);
        table[index].add(name);
    }

    /**
     * metode untuk menampilkan isi hash table.
     */
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("index " + i + ": ");
            for (String name : table[i]) {
                System.out.print(name + " -> ");
            }
            System.out.println("null");
        }
    }
}
