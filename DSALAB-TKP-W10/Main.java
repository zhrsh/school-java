public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        // menambahkan data mahasiswa
        hashTable.add(new Mahasiswa("101", "Andi"));
        hashTable.add(new Mahasiswa("102", "Natalie"));
        hashTable.add(new Mahasiswa("103", "Aulia"));
        hashTable.add(new Mahasiswa("104", "Budi"));
        hashTable.add(new Mahasiswa("105", "Lizzie"));

        // mencari data mahasiswa
        Mahasiswa m = hashTable.search("102");
        if (m != null) {
            System.out.println("data ditemukan: " + m);
        } else {
            System.out.println("data tidak ditemukan.");
        }

        // menghapus data mahasiswa
        boolean isRemoved = hashTable.remove("101");
        if (isRemoved) {
            System.out.println("data mahasiswa dengan NIM 101 telah dihapus.");
        } else {
            System.out.println("data mahasiswa dengan NIM 101 tidak ditemukan.");
        }

        // mencoba mencari data yang telah dihapus
        m = hashTable.search("101");
        if (m != null) {
            System.out.println("data ditemukan: " + m);
        } else {
            System.out.println("data tidak ditemukan.");
        }
    }
}
