package model;  //mengorganisir dan mengelompokkan kelas bersama
public class User {
    //variabel username dan password untuk menyimpan data user buat login
    private String username;
    private String password;

    //konstruktor kelas 'User'
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //metode akses 'getUsername()' yang mengembalikan nilai 'username' untuk mendapatkan username dari pengguna
    public String getUsername() {
        return username;
    }

    //metode akses 'getPassword()' yang mengembalikan nilai 'password' untuk mendapatkan password dari pengguna
    public String getPassword() {
        return password;
    }
}