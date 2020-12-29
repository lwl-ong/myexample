package com.ydfind.demo.springtimer.pojo;
/*
* 实体类
* */
public class DeviceBlockUser {

    //地区
    private String areaname;
    //驾校
    private String shortname;
    //车牌号
    private String plate;
    //设备号
    private String poscode;
    //操作时间
    private String operatetime;
    //操作类型
    private String operatetype;
    //操作结果
    private String message;

    @Override
    public String toString() {
        return "DeviceBlockUser{" +
                "areaname='" + areaname + '\'' +
                ", shortname='" + shortname + '\'' +
                ", plate='" + plate + '\'' +
                ", poscode='" + poscode + '\'' +
                ", operatetime='" + operatetime + '\'' +
                ", operatetype='" + operatetype + '\'' +
                ", message='" + message + '\'' +
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getPoscode() {
        return poscode;
    }

    public void setPoscode(String poscode) {
        this.poscode = poscode;
    }

    public String getOperatetime() {
        return operatetime;
    }

    public void setOperatetime(String operatetime) {
        this.operatetime = operatetime;
    }

    public String getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(String operatetype) {
        this.operatetype = operatetype;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
