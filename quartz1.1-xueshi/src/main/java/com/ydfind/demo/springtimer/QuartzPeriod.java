package com.ydfind.demo.springtimer;

import com.ydfind.demo.springtimer.mybatis.PeriodQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuartzPeriod {

    private static Logger logger = LoggerFactory.getLogger(QuartzPeriod.class);
    public void doTask(){
        try{
            //7天前的日期
            /*String datanumber = String.valueOf(Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()))-7);*/
            PeriodQuery periodQuery = new PeriodQuery();
            //传参查询
            periodQuery.queryByDate();
            /*logger.info("执行开始，当前时间为：" + new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS").format(new Date()));*/
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
