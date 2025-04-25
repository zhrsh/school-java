package com.zhrsh.sistemperpus;

/**
 * parent class 'User'
 * 
 * berisi common methods dan attributes utk semua tipe pengguna.
 * attribut menggunakan access modifier 'protected' agar hanya 
 * bisa diakses oleh subclass.
 * @author Zahra A. S.
 */
public class User {
    protected String username;
    protected String userId;

    /**
     * constructor utk class User
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
