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
        System.out.println("Enqueued: " + data);
    }

    // remove element from the front
    public void dequeue() {
        Integer removed = queue.poll();
        if (removed == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Dequeued: " + removed);
        }
    }

    // display the elements in the queue
    public void display() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }
}
