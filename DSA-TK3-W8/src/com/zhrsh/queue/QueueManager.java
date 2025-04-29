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
        return queue.remove();
    }

    // menghitung jumlah item dalam queue
    public int countItems() {
        return queue.size();
    }

    // menampilkan item terdepan
    public String peekQueue() {
        return queue.peek();
    }

    // menampilkan isi queue
    public String displayQueue() {
        // if queue is not empty
        if (!queue.isEmpty()) {
            return queue.toString();
        } else {
            return "queue is empty.";
        }
    }
}

