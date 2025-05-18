package hashtable;
import java.util.LinkedList;

/**
 * kelas HashTable adalah implementasi dari tabel hash yang menyimpan objek Mahasiswa.
 * menggunakan LinkedList untuk menangani collision.
 */
public class HashTable {
    private LinkedList<Mahasiswa>[] table;
    private int size;

    // constructor
    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    /**
     * menghitung indeks hash untuk NIM mahasiswa.
     *
     * @param nim NIM mahasiswa yang akan dihitung indeks hash-nya.
     * @return indeks hash yang dihitung berdasarkan NIM.
     */
    private int hash(String nim) {
        return Math.abs(nim.hashCode()) % size;
    }

    /**
     * menambahkan objek Mahasiswa ke dalam tabel hash.
     *
     * @param mahasiswa Objek Mahasiswa yang akan ditambahkan.
     * @return true jika mahasiswa berhasil ditambahkan, false jika mahasiswa dengan NIM yang sama sudah ada.
     */
    public boolean add(Mahasiswa mahasiswa) {
        int index = hash(mahasiswa.getNim());
        for (Mahasiswa m : table[index]) {
            if (m.getNim().equals(mahasiswa.getNim())) {
                System.out.println("gagal. mahasiswa dengan NIM " + mahasiswa.getNim() + " sudah ada.");
                return false; // prevent adding duplicates
            }
        }
        table[index].add(mahasiswa);
        return true;
    }

    /**
     * mencari objek Mahasiswa berdasarkan NIM.
     *
     * @param nim NIM mahasiswa yang akan dicari.
     * @return Objek Mahasiswa jika ditemukan, null jika tidak ditemukan.
     */
    public Mahasiswa search(String nim) {
        int index = hash(nim);
        for (Mahasiswa m : table[index]) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null; // jika tidak ditemukan
    }

    /**
     * menghapus objek Mahasiswa dari tabel hash berdasarkan NIM.
     *
     * @param nim NIM mahasiswa yang akan dihapus.
     * @return true jika mahasiswa berhasil dihapus, false jika mahasiswa tidak ditemukan.
     */
    public boolean remove(String nim) {
        int index = hash(nim);
        for (Mahasiswa m : table[index]) {
            if (m.getNim().equals(nim)) {
                table[index].remove(m);
                return true; // ditemukan dan dihapus
            }
        }
        return false; // tidak ditemukan
    }
}
