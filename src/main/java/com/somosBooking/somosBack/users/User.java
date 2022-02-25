package com.somosBooking.somosBack.users;


public class User {
    int id;
    String userName;
    Usertype userType;
    String userMail;
    String phoneNumber;
    String password;
    String porfileImg;

    public User(int id, String userName, Usertype userType, String userMail, String phoneNumber, String password) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.userMail = userMail;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Usertype getUserType() {
        return userType;
    }

    public void setUserType(Usertype userType) {
        this.userType = userType;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPorfileImg() {
        return porfileImg;
    }

    public void setPorfileImg(String porfileImg) {
        this.porfileImg = porfileImg;
    }
}




