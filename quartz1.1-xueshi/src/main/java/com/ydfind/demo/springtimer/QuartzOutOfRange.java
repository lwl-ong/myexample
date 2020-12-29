package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.OutOfRange;

public class QuartzOutOfRange {
    public void doTask(){
        try{

            OutOfRange OutOfRange = new OutOfRange();
            //查询方法
            OutOfRange.queryOutOfRange();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
