package com.ydfind.demo.springtimer.pojo;
/*
* 实体类
* */
public class C1ChangeC2User {

    //驾校
    private String shortname;
    //数量
    private String sumnum;

    @Override
    public String toString() {
        return "C1ChangeC2{" +
                "shortname='" + shortname + '\'' +
                ", sumnum='" + sumnum + '\'' +
                '}';
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getSumnum() {
        return sumnum;
    }

    public void setSumnum(String sumnum) {
        this.sumnum = sumnum;
    }
}
