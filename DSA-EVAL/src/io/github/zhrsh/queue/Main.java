package io.github.zhrsh.queue;

public class Main {
    public static void main(String[] args) {
        int[] data = {39, 88, 102, 64, 128, 113, 124, 248, 46, 39, 92, 117, 184, 351, 52, 60, 104, 77, 208, 94};
        
        arrayQueue(data);
        linkedListQueue(data);
    }

    // percobaan penghapusan int 92 dengan array based queue
    public static void arrayQueue(int[] data) {
        ArrayQueue queueArr = new ArrayQueue(data.length);

        for (int num : data) {
            queueArr.enqueue(num);
        }

        System.out.println("\nARRAY BASED QUEUE\nsebelum penghapusan:");
        queueArr.display();

        queueArr.removeValue(92);

        System.out.println("setelah menghapus nilai 92:");
        queueArr.display();
    }

    // percobaan penghapusan int 92 dengan 
    public static void linkedListQueue(int[] data) {
        LinkedListQueue queueLL = new LinkedListQueue();

        for (int num : data) {
            queueLL.enqueue(num);
        }

        System.out.println("\nLINKED LIST BASED QUEUE\nsebelum penghapusan:");
        queueLL.display();

        queueLL.removeValue(92);

        System.out.println("setelah menghapus nilai 92:");
        queueLL.display();
    }
}
