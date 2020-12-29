package com.ydfind.demo.springtimer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MyQuartzMainApp {
    private static Logger logger = LoggerFactory.getLogger(MyQuartzMainApp.class);
    public static void main(String[] args){
        try{
            //打成jar包运行时，getFile()方法获取不到jar包里文件路径
            //new ClassPathXmlApplicationContext("classpath:quartz_period.xml");
            new FileSystemXmlApplicationContext(ClassLoader.getSystemResource("quartz_period.xml").getFile());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
