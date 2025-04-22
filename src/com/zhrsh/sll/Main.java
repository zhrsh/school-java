/**
 * Main.java
 * tugas zahra a. s.
 */
package com.zhrsh.sll;
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(30);

        System.out.println("isi Linked List:");
        list.display();

        list.delete(30);
        System.out.println("setelah menghapus 30:");
        list.display();
    }
}
