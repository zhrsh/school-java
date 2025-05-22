package io.github.zhrsh.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * kelas ini merepresentasikan queue menggunakan linkedlist.
 * @author Zahra A. S.
 */
public class LinkedListQueue {
    private Queue<Integer> queue;

    /**
     * konstruktor untuk menginisialisasi queue.
     */
    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    /**
     * menambahkan elemen ke bagian belakang queue.
     *
     * @param data elemen yang akan ditambahkan ke queue.
     */
    public void enqueue(int data) {
        queue.offer(data);
    }

    /**
     * menghapus semua instance nilai tertentu dari queue.
     *
     * @param value nilai yang akan dihapus dari queue.
     */
    public void removeValue(int value) {
        Queue<Integer> temp = new LinkedList<>();
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current != value) {
                temp.offer(current);
            }
        }
        queue = temp;
    }

    /**
     * menampilkan elemen-elemen dalam queue.
     */
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("queue kosong");
        } else {
            System.out.println("isi queue: " + queue);
        }
    }
}