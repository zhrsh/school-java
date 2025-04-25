package com.zhrsh.sistemperpus;

/**
 * INHERITANCE: child class 'Admin'
 * 
 * class ini mewarisi atribut dan method dari parent class User.
 * class ini mewakili pengguna dengan hak akses admin.
 * @author Zahra A. S.
 */
public class Admin extends User {
    /**
     * constructor utk class Admin.
     * @param username nama pengguna admin
     * @param userId id pengguna admin
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
