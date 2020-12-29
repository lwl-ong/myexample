package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.OfflineTraining;

public class QuartzOfflineTraining {
    public void doTask(){
        try{

            OfflineTraining offlineTraining = new OfflineTraining();
            //查询方法
            offlineTraining.queryUser();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
