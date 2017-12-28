package com.smart.context;

import com.smart.reflect.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyApplicationContexTest {
    public static void main(String[] args) {
        ApplicationContext atx = new GenericGroovyApplicationContext("classpath:com/smart/context/groovy-beans.groovy");
        Car car = (Car)atx.getBean("car");
        car.introduce();
    }
}
