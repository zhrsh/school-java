package com.zhrsh.sistemperpus;

/**
 * INHERITANCE: child class 'Member'
 * 
 * class ini mewarisi atribut dan method dari parent class User.
 * class ini mewakil pengguna biasa (member).
 */
public class Member extends User {
    /**
     * Constructor utk class Member.
     * 
     * @param username nama penguna member
     * @param userId id pengguna member
     */
    public Member(String username, String userId) {
        super(username, userId);
    }

    /**
     * POLYMORPHISM: menggunakan method override (dengan tag @Override)
     * 
     * method ini di-override utk memberikan implementasi khusus bagi member 
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
