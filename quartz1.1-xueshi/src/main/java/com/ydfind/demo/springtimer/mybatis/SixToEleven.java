package com.ydfind.demo.springtimer.mybatis;

import com.ydfind.demo.springtimer.utils.ExcelUtil;
import junit.framework.Test;
import org.apache.commons.io.FileUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SixToEleven {

    //日期号
    private static String datenum;
    private static String datenumstart;
    private long ms;
    private static org.slf4j.Logger logger = LoggerFactory.getLogger(SixToEleven.class);
    public void querySixToEleven() throws IOException {
        logger.error("执行开始，时间为：" + new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS").format(new Date()));
        datenumstart = new SimpleDateFormat("yyyyMMdd HH-mm-ss-SSS").format(new Date());
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行SQL
        List<Object> userList = sqlSession.selectList("test.querySixToEleven");
        datenum = new SimpleDateFormat("yyyyMMdd HH-mm-ss-SSS").format(new Date());
        logger.error("执行结束，时间为：" + new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS").format(new Date()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyymmdd hh-mm-ss-SSS");
        try {
            Date d1 = sdf.parse(datenumstart);
            Date d2 = sdf.parse(datenum);
            ms = d2.getTime() - d1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        logger.error("此次耗时：：" + ms);
        //关闭连接
        sqlSession.close();

        //设置表头信息
        String sheetTitle = "晚6点到11点训练" + datenum.substring(0,8);
        String[] title = {"地区", "驾校","车牌号","开始时间","结束时间"};
        byte b[] = ExcelUtil.export(sheetTitle, title, userList);
        //设置保存地址
        File f = new File("D:\\jszc_data\\"+datenum.substring(0,8)+"\\"+sheetTitle+".xls");
        try {
            FileUtils.writeByteArrayToFile(f, b, true);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
