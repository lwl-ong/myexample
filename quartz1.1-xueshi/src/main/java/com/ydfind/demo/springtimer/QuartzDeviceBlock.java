package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.DeviceBlock;
import com.ydfind.demo.springtimer.mybatis.SixToEleven;

public class QuartzDeviceBlock {
    public void doTask(){
        try{

            DeviceBlock deviceBlock = new DeviceBlock();
            //查询方法
            deviceBlock.queryDeviceBlock();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
