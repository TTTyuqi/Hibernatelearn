package org.tyq.hiberlen.model;

import java.util.HashSet;
import java.util.Set;

public class userAddr {
    private int uaId;
    private String uaName;
    private String uaQQnum;
    private Set<String> uaAddress =new HashSet<>();

    public userAddr() {

    }

    public userAddr(String uaName, String uaQQnum) {
        this.uaName = uaName;
        this.uaQQnum = uaQQnum;
    }

    public userAddr(int uaId, String uaName, String uaQQnum) {
        this.uaId = uaId;
        this.uaName = uaName;
        this.uaQQnum = uaQQnum;
    }

    public int getUaId() {
        return uaId;
    }

    public void setUaId(int uaId) {
        this.uaId = uaId;
    }

    public String getUaName() {
        return uaName;
    }

    public void setUaName(String uaName) {
        this.uaName = uaName;
    }

    public String getUaQQnum() {
        return uaQQnum;
    }

    public void setUaQQnum(String uaQQnum) {
        this.uaQQnum = uaQQnum;
    }

    public Set<String> getUaAddress() {
        return uaAddress;
    }

    public void setUaAddress(Set<String> uaAddress) {
        this.uaAddress = uaAddress;
    }

    @Override
    public String toString() {
        return "userAddr{" +
                "uaId=" + uaId +
                ", uaName='" + uaName + '\'' +
                ", uaQQnum='" + uaQQnum + '\'' +
                ", uaAddress=" + uaAddress +
                '}';
    }
}
