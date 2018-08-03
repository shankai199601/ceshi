package com.haomostudio.SpringMVCTemplate.service.common;

/**
 * @Author: ShanKai
 * @Description:
 * @Date:Created in 9:00 2018/8/3
 */

public class User {
    private int uid;
    private String userName;
    private String userPass;
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPass() {
        return userPass;
    }
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    @Override
    public String toString() {
        return "User [uid=" + uid + ", userName=" + userName + ", userPass=" + userPass + "]";
    }


}