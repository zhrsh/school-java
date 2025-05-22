package io.github.zhrsh.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    private Queue<Integer> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    // add element to the rear
    public void enqueue(int data) {
        queue.offer(data);
    }

    // menghapus semua nilai tertentu (e. g., 92)
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

    // display the elements in the queue
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("queue kosong");
        } else {
            System.out.println("isi queue: " + queue);
        }
    }
}
