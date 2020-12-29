package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.EveningPeak;
import com.ydfind.demo.springtimer.mybatis.OfflineTraining;

public class QuartzEveningPeak {
    public void doTask(){
        try{

            EveningPeak eveningPeak = new EveningPeak();
            //查询方法
            eveningPeak.queryEveningPeak();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
