package com.soft1010.common.utils;

import com.soft1010.common.utils.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author zhangjifu
 * @Create time: 2017/2/16 11:17
 * @Description:
 */
public class ExecuteJar {

    private static final String DEFAULT_PATH = "spring/applicationContext.xml";

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(DEFAULT_PATH);
        System.out.println("---------start--------");
        long start = System.currentTimeMillis();

        DemoService demoService = (DemoService) applicationContext.getBean("demoService");
        String name = demoService.handleName();
        System.out.println("result = " + name);

        System.out.println("---------end--------  [" + (System.currentTimeMillis() - start) + "]ms");


    }
}
