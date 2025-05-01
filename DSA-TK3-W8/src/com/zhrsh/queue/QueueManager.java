package com.zhrsh.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private Queue<String> queue;

    public QueueManager() {
        queue = new LinkedList<>();
    }

    // menambahkan item ke dalam queue
    public void enqueue(String item) {
        queue.add(item);
    }

    // menghapus item dari queue
    public String dequeue() {
        return queue.poll(); // poll() agar tidak exception jika queue kosong
    }

    // menghitung jumlah item dalam queue
    public int countItems() {
        return queue.size();
    }

    // menampilkan item terdepan
    public String peekQueue() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            return "queue kosong.";
        }
    }

    // menampilkan isi queue
    public String displayQueue() {
        // if queue is not empty
        if (!queue.isEmpty()) {
            return queue.toString();
        } else {
            return "queue kosong.";
        }
    }
}

