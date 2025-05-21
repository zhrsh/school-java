package io.github.zhrsh.hashtable;

import java.util.LinkedList;
// import java.lang.Math;

public class HashTable {
    private LinkedList<String>[] table;
    private int size;
    private boolean displayDebug; // untuk menampilkan proses hash function

    // constructor
    @SuppressWarnings("unchecked")
    public HashTable(int size, boolean displayDebug) {
        this.size = size;
        this.displayDebug = displayDebug;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // hash function
    // jika attribute debug bernilai true, maka metode ini akan mencetak informasi tentang proses hashing, 
    // termasuk string yang di-hash, nilai panjangnya, dan hasil akhir dari operasi modulo.
    private int hash(String name) {
        int hashedString = name.length(); // custom hash function sesuai diagram
        // int hashedString = Math.abs(name.hashCode()); // hash function lebih efisien
        
        int hashedStringRound = hashedString % size;
        if (displayDebug) {
            System.out.printf(
                "%-7s ->  %s  ->  %s %% 10 = %s%n",
                name, hashedString, hashedString, hashedStringRound
            );
        }
        return hashedStringRound;
    }

    // insert method
    public void insert(String name) {
        int index = hash(name);
        table[index].add(name);
    }

    // display method
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
