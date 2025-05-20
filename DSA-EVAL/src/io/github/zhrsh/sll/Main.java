package io.github.zhrsh.sll;

/**
 * kelas Main untuk titik masuk program dan menguji fungsi dari SinglyLinkedList.
 * @author Zahra A. S.
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // a. insert semua angka ke Single Linked List dan tampilkan
        int[] numbers = {100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25, 43, 5, 9, 42, 6, 11, 41, 7, 13};
        for (int number : numbers) {
            list.insert(number);
        }
        System.out.println("\na. linked list setelah insert:");
        list.display();

        // b. lakukan proses insert angka 32 setelah angka 30
        list.insertAfter(30, 32);
        System.out.println("b. linked list setelah insert 32 setelah 30:");
        list.display();

        // c. lakukan proses delete angka 42
        list.delete(42);
        System.out.println("c. linked list setelah delete angka 42:");
        list.display();
    }
}

