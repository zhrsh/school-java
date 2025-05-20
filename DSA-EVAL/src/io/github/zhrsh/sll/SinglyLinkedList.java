package io.github.zhrsh.sll;

/**
 * kelas SinglyLinkedList merepresentasikan linked list sederhana.
 * @author Zahra A. S.
 */
public class SinglyLinkedList {
    Node head;

    /**
     * menambahkan node baru ke akhir linked list.
     *
     * @param data nilai yang akan disimpan dalam node baru.
     */
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    /**
     * menampilkan isi dari linked list.
     */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null\n");
    }

    /**
     * menyisipkan node baru setelah node dengan nilai tertentu.
     *
     * @param target nilai node setelahnya node baru akan disisipkan.
     * @param data nilai yang akan disimpan dalam node baru.
     */
    public void insertAfter(int target, int data) {
        Node current = head;
        while (current != null && current.data != target) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(data);
            newNode.next = current.next;
            current.next = newNode;
        } else {
            System.out.println("target " + target + " tidak ditemukan.");
        }
    }

    /**
     * menghapus node dengan nilai tertentu dari linked list.
     *
     * @param data nilai node yang akan dihapus.
     */
    public void delete(int data) {
        if (head == null) return;

        // jika node yang akan dihapus adalah head
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        // jika data tidak ditemukan
        if (current == null) {
            System.out.println("data " + data + " tidak ditemukan.");
            return;
        }

        // menghapus node
        previous.next = current.next;
    }
}
