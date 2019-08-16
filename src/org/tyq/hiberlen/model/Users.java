package org.tyq.hiberlen.model;

public class Users {
    private int uId;
    private String uName;
    private String uPasswd;
    private String uEmali;

    public Users() {

    }

    public Users(String uName, String uPasswd, String uEmali) {
        this.uName = uName;
        this.uPasswd = uPasswd;
        this.uEmali = uEmali;
    }

    public Users(int uId, String uName, String uPasswd, String uEmali) {
        this.uId = uId;
        this.uName = uName;
        this.uPasswd = uPasswd;
        this.uEmali = uEmali;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPasswd() {
        return uPasswd;
    }

    public void setuPasswd(String uPasswd) {
        this.uPasswd = uPasswd;
    }

    public String getuEmali() {
        return uEmali;
    }

    public void setuEmali(String uEmali) {
        this.uEmali = uEmali;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uPasswd='" + uPasswd + '\'' +
                ", uEmali='" + uEmali + '\'' +
                '}';
    }
}
