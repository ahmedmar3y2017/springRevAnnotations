//package com.spring;
//
//import com.spring.config.WebMvcConfig;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class main {
//
//    public static void main(String[] args) {
//        // load from xml file
////        ApplicationContext context =
////                new ClassPathXmlApplicationContext("application_context.xml");
//
//        // load from java config file
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(WebMvcConfig.class);
//        context.refresh();
//        System.out.println(context.getBeanDefinitionNames().length);
//
//        employee employee = (employee) context.getBean("employee");
//        System.out.println(context.getBeanDefinitionNames().length);
////        D:\tutorials\springRevision\src\main\resources\META-INF\spring\camel-context.xml
//        System.out.println(employee.getString());
//        System.out.println("Bean Factory Initialized !!");
//
//        System.out.println(employee.getDepartement().getDeptName());
//        System.out.println(context.getBeanDefinitionNames().length);
//
//    }
//}
