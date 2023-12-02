package com.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");) {
            TestBean bean = context.getBean("testBean", TestBean.class);
            System.out.println(bean.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
