package io.github.zhrsh.hashtable;

import java.util.LinkedList;
// import java.lang.Math;

public class HashTable {
    private LinkedList<String>[] table;
    private int size;

    // constructor
    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // hash function
    private int hash(String name) {
        return name.length() % size; // custom hash function sesuai diagram
        // return Math.abs(name.hashCode()) % size; // hash function lebih efisien
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
