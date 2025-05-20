package io.github.zhrsh.sll;

/**
 * kelas Node merepresentasikan sebuah node (elemen) dalam linked list.
 * @author Zahra A. S.
 */
public class Node {
    int data;
    Node next;

    /**
     * constructor untuk membuat node baru dengan data integer.
     *
     * @param data nilai integer yang akan disimpan dalam node
     */
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
