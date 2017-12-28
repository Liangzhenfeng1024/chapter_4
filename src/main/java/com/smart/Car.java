package com.smart;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean{
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用Car()构造函数。");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性。");
        this.brand = brand;
    }

    public void inroduce() {
        System.out.println("brand:" + brand + ";color:" + color + ";maxSpeed:" + maxSpeed);
    }

    //BeanFactoryAware接口方法
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("调用BeanFactoryAware.setBeanFactory()。");
        this.beanFactory = beanFactory;
    }

    //BeanNameAware接口方法
    public void setBeanName(String beanName) {
        System.out.println("调用BeanFactoryAware.setBeanName()。");
        this.beanName = beanName;
    }

    //InitailizingBean接口方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitailizingBean接口方法.afterPropertiesSet()。");
    }

    //DisposableBean接口方法
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean接口方法.destroy()。");
    }

    //通过<bean>的init-method属性指定的初始化方法
    public void myInit() {
        System.out.println("调用init-method属性指定的myInit()，将maxSpeed设置为240。");
        this.maxSpeed = 240;
    }

    //通过<bean>的destroy-method属性指定的销毁方法
    public void myDestory() {
        System.out.println("调用destroy-method所指定的myDestory()。");
    }
}
