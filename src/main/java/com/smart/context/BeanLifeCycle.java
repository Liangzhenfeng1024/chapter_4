package com.smart.context;

import com.smart.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanLifeCycle {
    private static void LifeCycleInBeanFactory() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/smart/context/beans.xml");
        Car car = ctx.getBean("car", Car.class);
        car.inroduce();

    }

    public static void main(String[] args) {
        LifeCycleInBeanFactory();
    }
}
