package com.ydfind.demo.springtimer.pojo;

import java.util.Date;

public class EveningPeakUser {
    //地区
    private String areaname;
    //驾校
    private String shortname;
    //车牌号
    private String carnum;
    //开始时间
    private String starttime;
    //结束时间
    private String endtime;

    @Override
    public String toString() {
        return "EveningPeakUser{" +
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

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}
