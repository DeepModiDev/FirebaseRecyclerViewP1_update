package com.deepmodi.firebaserecyclerviewp1.Model;

public class Category {

    private String userName;
    private String userSurname;
    private String userNumber;

    public Category() {
    }

    public Category(String userName, String userSurname, String userNumber) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

}
