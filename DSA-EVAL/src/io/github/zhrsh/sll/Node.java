package io.github.zhrsh.sll;

/**
 * kelas Node merepresentasikan element integer dari linked list.
 * @author Zahra A. S.
 */
public class Node {
    int data;
    Node next;

    /**
     * konstruktor untuk membuat node baru dengan data integer.
     *
     * @param data nilai integer yang akan disimpan dalam node.
     */
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
