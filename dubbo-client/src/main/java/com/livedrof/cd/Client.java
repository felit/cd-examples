package com.livedrof.cd;

import com.livedrof.cd.dubbo.IService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"});
        context.start();
        IService service = (IService) context.getBean("demoService");
        System.out.println(service.sayHello("world"));
        context.close();
    }
}
