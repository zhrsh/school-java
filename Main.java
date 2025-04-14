/**
 * TP2 DSA - singly linked list
 * tugas zahra a. s.
 */
class Node {
    int data;
    Node next;

    // constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    // menambahkan node di akhir linked list
    public void add(int data) {
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

    // menampilkan isi linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // menghapus node dengan nilai tertentu
    public void delete(int key) {
        Node current = head;
        Node previous = null;

        // jika head node adalah node yang ingin dihapus
        if (current != null && current.data == key) {
            head = current.next; // ubah head
            return;
        }

        // mencari node yang ingin dihapus
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        // jika node tidak ditemukan
        if (current == null) return;

        // menghapus node
        previous.next = current.next;
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(30);

        System.out.println("isi Linked List:");
        list.display();

        list.delete(30);
        System.out.println("setelah menghapus 30:");
        list.display();

        Node node = new Node(10);
        System.out.println(node); // output might look like: Node@1a2b3c4
    }
}
