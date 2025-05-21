package io.github.zhrsh.hashtable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        
        String[] names = {"Andi", "Ingrit", "Dora", "Chris", "Della", "Jeremy", "Jessica", "Bella", "Emma", "Blake"};
        for (String name : names) {
            // insert nama dalam array names
            hashTable.insert(name);
        }

        // tampilkan hash table
        System.out.println("\n=== HASH TABLE ===");
        hashTable.display();
    }
}
