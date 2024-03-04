package com.example.maddd;

public class storingdata {
    String username,email,password;

    public storingdata(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public storingdata(String username_s, String feedback1) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
