/*
 * TK1 DSAA - group 4
 * No. 1 - zahra a. s.
 */
package com.zhrsh.sistemperpus;

/**
 * main class utk menjalankan program sistem manajemen perpustakaan.
 * 
 * class ini berfungsi sebagai titik masuk (entry point) utk aplikasi, 
 * di mana object Admin dan Member dibuat dan interaksi dengan sistem perpustakaan dilakukan.
 */
public class SistemPerpus {
    public static void main(String[] args) {
        // membuat 1 object Admin dan 2 object Member dengan upcasting (instance dari User)
        Admin admin1 = new Admin("AdaLovelace", "001");
        Member member1 = new Member("JaneDoe", "002");
        Member member2 = new Member("JohnDoe", "003");

        // menggunakan polymorphism (dynamic method dispatch)
        admin1.interact(); // method interact() khusus obj Admin
        member1.interact(); // method interact() khusus obj Member
        member2.interact(); // method interact() khusus obj Member

        // contoh object Admin menambah dan menghapus buku
        admin1.addBook("The Shining");
        admin1.addBook("The Call of Cthulhu");
        admin1.removeBook("The Tell Tale Heart");

        // contoh object Member meminjam dan mengembalikan buku
        member1.borrowBook("The Shining");
        member1.returnBook("The Shining");
        member2.borrowBook("The Call of Cthulhu");
    }
}
