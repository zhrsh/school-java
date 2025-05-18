import java.util.LinkedList;

public class HashTable {
    private LinkedList<Mahasiswa>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String nim) {
        return Math.abs(nim.hashCode()) % size;
    }

    public void add(Mahasiswa mahasiswa) {
        int index = hash(mahasiswa.getNim());
        table[index].add(mahasiswa);
    }

    public Mahasiswa search(String nim) {
        int index = hash(nim);
        for (Mahasiswa m : table[index]) {
            if (m.getNim().equals(nim)) {
                return m;
            }
        }
        return null; // jika tidak ditemukan
    }

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
