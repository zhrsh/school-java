package io.github.zhrsh.queue;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }

    public void enqueue(int data) {
        if (rear == capacity) {
            System.out.println("queue is full");
            return;
        }
        queue[rear++] = data;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("queue kosong");
            return;
        }
        System.out.println("dequeued: " + queue[front]);
        front++;
    }

    public void display() {
        if (front == rear) {
            System.out.println("queue kosong");
            return;
        }
        System.out.print("isi queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
