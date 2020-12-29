package com.ydfind.demo.springtimer.pojo;

import java.util.Date;

public class SixToElevenUser {
    //地区
    private String areaname;
    //驾校
    private String shortname;
    //车牌号
    private String carnum;
    //开始时间
    private Date starttime;
    //结束时间
    private Date endtime;

    @Override
    public String toString() {
        return "SixToElevenUser{" +
                "areaname='" + areaname + '\'' +
                ", shortname='" + shortname + '\'' +
                ", carnum='" + carnum + '\'' +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
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

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}
