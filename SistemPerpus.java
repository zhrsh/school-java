/**
 * parent class 'User'
 * 
 * berisi common methods dan attributes utk semua tipe pengguna.
 * attribut menggunakan access modifier 'protected' agar hanya 
 * bisa diakses oleh subclass.
 */
class User {
    protected String username;
    protected String userId;

    /**
     * constructor utk kelas User
     * 
     * @param username nama pengguna
     * @param userId id pengguna
     */
    public User(String username, String userId) {
        this.username = "@" + username;
        this.userId = userId;
    }

    /**
     * method utk print pemberitahuan interaksi pengguna dengan sistem perpustakaan.
     */
    public void interact() {
        System.out.println("[User] " + username + " sedang berinteraksi dengan sistem perpustakaan.");
    }
}

/**
 * INHERITANCE: child class 'Admin'
 * 
 * class ini mewarisi atribut dan method dari parent class User.
 * class ini mewakili pengguna dengan hak akses admin.
 */
class Admin extends User {
    /**
     * constructor utk kelas Admin.
     * @param username nama pengguna
     * @param userId id pengguna
     */
    public Admin(String username, String userId) {
        // super() utk memanggil constructor dari superclass/parent class (User)
        super(username, userId);
    }

    /**
     * POLYMORPHISM: menggunakan method override (dengan tag @Override)
     * 
     * method ini di-override utk memberikan implementasi khusus bagi admin 
     * saat berinteraksi dengan sistem perpustakaan.
     */
    @Override
    public void interact() {
        System.out.println("[Admin] " + username + " sedang mengelola sistem perpustakaan.");
    }

    /**
     * method admin utk menambahkan buku ke dalam sistem.
     * 
     * @param bookTitle judul buku yang akan ditambahkan
     */
    public void addBook(String bookTitle) {
        System.out.println("[Admin] " + username + " menambahkan buku: \"" + bookTitle + "\"");
    }

    /**
     * method admin utk menghapus buku ke dalam sistem.
     * 
     * @param bookTitle judul buku yang akan dihapus
     */
    public void removeBook(String bookTitle) {
        System.out.println("[Admin] " + username + " menghapus buku: \"" + bookTitle + "\"");
    }
}

/**
 * INHERITANCE: child class 'Member'
 * 
 * class ini mewarisi atribut dan method dari parent class User.
 * class ini mewakil pengguna biasa (member).
 */
class Member extends User {
    /**
     * Constructor utk kelas Member.
     * 
     * @param username nama pengguna
     * @param userId id pengguna
     */
    public Member(String username, String userId) {
        super(username, userId);
    }

    /**
     * POLYMORPHISM: menggunakan method override (dengan tag @Override)
     * 
     * Method ini di-override utk memberikan implementasi khusus bagi member 
     * saat berinteraksi dengan sistem perpustakaan.
     */
    @Override
    public void interact() {
        System.out.println("[Member] " + username + " sedang berinteraksi dengan sistem perpustakaan.");
    }

    /**
     * method utk meminjam buku dari sistem perpustakaan.
     * 
     * @param bookTitle judul buku yang akan dipinjam
     */
    public void borrowBook(String bookTitle) {
        System.out.println("[Member] " + username + " meminjam buku: \"" + bookTitle + "\"");
    }

    /**
     * method utk mengembalikan buku ke sistem perpustakaan.
     * 
     * @param bookTitle judul buku yang akan dikembalikan
     */
    public void returnBook(String bookTitle) {
        System.out.println("[Member] " + username + " mengembalikan buku: \"" + bookTitle + "\"");
    }
}

/**
 * main class utk menjalankan program sistem manajemen perpustakaan.
 * 
 * class ini berfungsi sebagai titik masuk (entry point) utk aplikasi, 
 * di mana objek Admin dan Member dibuat dan interaksi dengan sistem perpustakaan dilakukan.
 */
public class SistemPerpus {
    public static void main(String[] args) {
        // membuat object Admin dan Member dengan upcasting (instance dari User)
        Admin admin1 = new Admin("Jane", "001");
        Member member1 = new Member("John", "002");

        // menggunakan polymorphism (dynamic method dispatch)
        admin1.interact(); // method interact khusus Admin
        member1.interact(); // method interact khusus Member

        // objek Admin menambah dan menghapus buku
        admin1.addBook("The Shining");
        admin1.removeBook("The Tell Tale Heart");

        // objek Member meminjam dan mengembalikan buku
        member1.borrowBook("The Shining");
        member1.returnBook("The Shining");
    }
}
