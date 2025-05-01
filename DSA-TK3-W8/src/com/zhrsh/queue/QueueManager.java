package com.zhrsh.queue;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Kelas QueueManager mengelola queue/antrian yang menyimpan item bertipe String.
 * Kelas ini menyediakan metode untuk menambah, menghapus, menghitung, 
 * dan menampilkan item dalam queue.
 * @author Zahra A. S.
 */
public class QueueManager {
    private Queue<String> queue;

    /**
     * Konstruktor untuk menginisialisasi QueueManager.
     * Membuat instance baru dari LinkedList yang digunakan sebagai queue.
     */
    public QueueManager() {
        queue = new LinkedList<>();
    }

    /**
     * Menambahkan item ke dalam queue.
     *
     * @param item item yang akan ditambahkan ke queue
     */
    public void enqueue(String item) {
        queue.add(item);
    }

    /**
     * Menghapus item dari depan queue.
     *
     * @return item yang dihapus dari queue, atau null jika queue kosong
     */
    public String dequeue() {
        return queue.poll(); // poll() agar tidak exception jika queue kosong
    }

    /**
     * Menghitung jumlah item yang ada dalam queue.
     *
     * @return jumlah item dalam queue
     */
    public int countItems() {
        return queue.size();
    }

    /**
     * Menampilkan item terdepan dalam queue tanpa menghapusnya.
     *
     * @return item terdepan dalam queue, atau pesan jika queue kosong
     */
    public String peekQueue() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            return "queue kosong.";
        }
    }

    /**
     * Menampilkan semua item yang ada dalam queue.
     *
     * @return string yang berisi semua item dalam queue, atau pesan jika queue kosong
     */
    public String displayQueue() {
        // if queue is not empty
        if (!queue.isEmpty()) {
            return queue.toString();
        } else {
            return "queue kosong.";
        }
    }
}
