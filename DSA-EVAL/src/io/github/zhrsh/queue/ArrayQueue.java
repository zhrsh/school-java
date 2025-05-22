package io.github.zhrsh.queue;

/**
 * kelas ini merepresentasikan queue menggunakan array.
 * @author Zahra A. S.
 */
public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    /**
     * konstruktor untuk menginisialisasi queue dengan ukuran tertentu.
     *
     * @param size ukuran maksimum queue.
     */
    public ArrayQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = 0;
    }

    /**
     * menambahkan elemen ke queue.
     *
     * @param data elemen yang akan ditambahkan ke queue.
     */
    public void enqueue(int data) {
        if (rear == capacity) {
            System.out.println("queue penuh");
            return;
        }
        queue[rear++] = data;
    }

    /**
     * menampilkan elemen-elemen dalam queue.
     */
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

    /**
     * menghapus semua kemunculan nilai tertentu dari queue.
     *
     * @param value nilai yang akan dihapus dari queue.
     */
    public void removeValue(int value) {
        int[] newQueue = new int[capacity];
        int newRear = 0;

        for (int i = front; i < rear; i++) {
            if (queue[i] != value) {
                newQueue[newRear++] = queue[i];
            }
        }

        // reset state
        queue = newQueue;
        front = 0;
        rear = newRear;
    }
}