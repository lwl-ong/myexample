package com.ydfind.demo.springtimer.pojo;
/*
* 实体类
* */
public class PeriodUser {

    private String traindate;
    private int ct2;
    private int ct;

    @Override
    public String toString() {
        return "User{" +
                "traindate='" + traindate + '\'' +
                ", ct2=" + ct2 +
                ", ct=" + ct +
                '}';
    }

    public String getTraindate() {
        return traindate;
    }

    public void setTraindate(String traindate) {
        this.traindate = traindate;
    }

    public int getCt2() {
        return ct2;
    }

    public void setCt2(int ct2) {
        this.ct2 = ct2;
    }

    public int getCt() {
        return ct;
    }

    public void setCt(int ct) {
        this.ct = ct;
    }
}
