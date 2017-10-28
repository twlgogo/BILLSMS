package com.ttwl.billsms;

/**
 * Created by tanweiliang on 2017/10/28.
 */

public class User {
    private String userid = null;
    private String username = null;
    private String groupid = null;
    private String phonenum = null;

    public String getGroupid() {
        return groupid;
    }

    public String getUserid() {
        return userid;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public String getUsername() {
        return username;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
