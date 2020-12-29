package com.ydfind.demo.springtimer.pojo;

public class OfflineTrainingUser {
    private String drivingschool;
    private String platemumber;

    @Override
    public String toString() {
        return "OfflineTrainingUser{" +
                "drivingschool='" + drivingschool + '\'' +
                ", platemumber='" + platemumber + '\'' +
                '}';
    }

    public String getDrivingschool() {
        return drivingschool;
    }

    public void setDrivingschool(String drivingschool) {
        this.drivingschool = drivingschool;
    }

    public String getPlatemumber() {
        return platemumber;
    }

    public void setPlatemumber(String platemumber) {
        this.platemumber = platemumber;
    }
}
