package io.github.zhrsh.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10, true);
        
        // array nama yang diminta
        String[] names = {"Andi", "Ingrit", "Dora", "Chris", "Della", "Jeremy", "Jessica", "Bella", "Emma", "Blake"};
        
        // insert nama dalam array names
        System.out.println("\n=== PROSES HASHING ===");
        for (String name : names) {
            hashTable.insert(name);
        }

        // tampilkan hash table
        System.out.println("\n=== HASH TABLE ===");
        hashTable.display();
    }
}
