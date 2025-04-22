/**
 * LinkedList.java - program database mahasiswa
 * tugas zahra a. s.
 */
package database;
/**
 * Kelas LinkedList merepresentasikan struktur data linked list untuk menyimpan data mahasiswa.
 */
public class LinkedList {
    private Mahasiswa head;

	/**
     * Menambahkan data mahasiswa baru ke dalam linked list.
     *
     * @param nim NIM mahasiswa
     * @param nama Nama mahasiswa
     * @param jurusan Jurusan mahasiswa
     */
    public void push(String nim, String nama, String jurusan) {
        Mahasiswa newMahasiswa = new Mahasiswa(nim, nama, jurusan);
        if (head == null) {
            head = newMahasiswa;
        } else {
            Mahasiswa current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newMahasiswa;
        }
    }

	/**
     * Menampilkan semua data mahasiswa yang ada dalam linked list.
     * Data akan diurutkan berdasarkan NIM sebelum ditampilkan.
     */
    public void display() {
        if (head == null) {
            System.out.println("tidak ada data mahasiswa.");
            return;
        }

        // sort data berdasarkan NIM
        head = sort(head);

        Mahasiswa current = head;
        while (current != null) {
            System.out.println("NIM: " + current.nim + ", Nama: " + current.nama + ", Jurusan: " + current.jurusan);
            current = current.next;
        }
    }

	/**
     * Mengurutkan linked list menggunakan algoritma merge sort.
     *
     * @param head Kepala dari linked list yang akan diurutkan
     * @return Kepala dari linked list yang sudah diurutkan
     */
    private Mahasiswa sort(Mahasiswa head) {
        if (head == null || head.next == null) {
            return head;
        }

        Mahasiswa mid = getMiddle(head);
        Mahasiswa nextOfMid = mid.next;

        mid.next = null;

        Mahasiswa left = sort(head);
        Mahasiswa right = sort(nextOfMid);

        return merge(left, right);
    }

	/**
     * Menggabungkan dua linked list yang sudah terurut menjadi satu linked list yang terurut.
     *
     * @param left Kepala dari linked list kiri
     * @param right Kepala dari linked list kanan
     * @return Kepala dari linked list yang sudah digabungkan dan terurut
     */
    private Mahasiswa merge(Mahasiswa left, Mahasiswa right) {
        if (left == null) return right;
        if (right == null) return left;

        if (left.nim.compareTo(right.nim) < 0) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

	/**
     * Mencari dan mengembalikan elemen tengah dari linked list.
     *
     * @param head Kepala dari linked list
     * @return Elemen tengah dari linked list
     */
    private Mahasiswa getMiddle(Mahasiswa head) {
        if (head == null) return head;

        Mahasiswa slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
	/**
     * Menghapus semua data mahasiswa dari linked list.
     */
    public void pop() {
        head = null;
        System.out.println("semua data mahasiswa telah dihapus.");
    }
}