package com.ydfind.demo.springtimer.pojo;

import java.util.Date;

public class OutOfRangeUser {
    //地区
    private String areaname;
    //驾校
    private String shortname;
    //车牌号
    private String carnum;

    @Override
    public String toString() {
        return "OutOfRangeUser{" +
                "areaname='" + areaname + '\'' +
                ", shortname='" + shortname + '\'' +
                ", carnum='" + carnum + '\'' +
                '}';
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }
}
