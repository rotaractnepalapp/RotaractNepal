package com.rotaractnepalapp.Model;

/**
 * Created by Dell on 2/9/2018.
 */

public class User {
    private String userName;
    private String userPassword;
    private String userEmailID;
    private String userRIDistrictNo;

    public User(){
    }

    public User(String userName, String userPassword, String userEmailID, String userRIDistrictNo) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmailID = userEmailID;
        this.userRIDistrictNo = userRIDistrictNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmailID() {
        return userEmailID;
    }

    public void setUserEmailID(String userEmailID) {
        this.userEmailID = userEmailID;
    }

    public String getUserRIDistrictNo() {
        return userRIDistrictNo;
    }

    public void setUserRIDistrictNo(String userRIDistrictNo) {
        this.userRIDistrictNo = userRIDistrictNo;
    }
}
