package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.EveningPeak;
import com.ydfind.demo.springtimer.mybatis.SixToEleven;

public class QuartzSixToEleven {
    public void doTask(){
        try{

            SixToEleven sixToEleven = new SixToEleven();
            //查询方法
            sixToEleven.querySixToEleven();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
