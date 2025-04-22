/**
 * SinglyLinkedList.java
 * tugas zahra a. s.
 */
package com.zhrsh.sll;
public class SinglyLinkedList {
    public Node head;

    // menambahkan node di akhir linked list
    public void add(int data) {
        Node newNode = new Node(data);
        System.out.println("new node in address: " + newNode + ", with data: " + data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // menampilkan isi linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // menghapus node dengan nilai tertentu
    public void delete(int key) {
        Node current = head;
        Node previous = null;

        // jika head node adalah node yang ingin dihapus
        if (current != null && current.data == key) {
            head = current.next; // ubah head
            return;
        }

        // mencari node yang ingin dihapus
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // jika node tidak ditemukan
        if (current == null) return;

        // menghapus node
        previous.next = current.next;
    }
}