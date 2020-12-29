package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.C1ChangeC2;
import com.ydfind.demo.springtimer.mybatis.SixToEleven;

public class QuartzC1ChangeC2 {
    public void doTask(){
        try{

            C1ChangeC2 c1ChangeC2 = new C1ChangeC2();
            //查询方法
            c1ChangeC2.queryC1ChangeC2();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
