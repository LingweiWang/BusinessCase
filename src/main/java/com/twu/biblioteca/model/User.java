package com.twu.biblioteca.model;

/**
 * Created by apple on 15-6-4.
 */
public class User {
    private String userNumber;
    private String passWord;
    private String type ;
    private String status;
    private String userName;
    private String emailAddress;
    private String phoneNumber;

    public User(){};
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public User(String userNumber, String passWord, String type, String status, String userName, String emailAddress, String phoneNumber) {
        this.userNumber = userNumber;
        this.passWord = passWord;
        this.type = type;
        this.status = status;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
