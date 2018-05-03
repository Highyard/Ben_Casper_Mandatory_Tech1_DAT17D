package com.example.demo.domains;

public class SystemUser {

    //private int id;
    private String userName;
    private String password;
    private String role;

    public SystemUser(String userName, String password, String role) {
        //this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public SystemUser() {

    }





    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



