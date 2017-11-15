package com.lc.mmqdemo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:LC
 * @Date:Created in 22:20 2017/11/15
 * @Modifyed by:
 */
public class Initialization {
    private static ApplicationContext context;
    private static Config config;

    public static void init(){
        context = new ClassPathXmlApplicationContext("classpath*:applicationcontent.xml");
        config = (Config)context.getBean("config");
    }
}
