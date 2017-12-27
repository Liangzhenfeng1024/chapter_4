package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {

    public static void main(String[] args) throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.reflect.PrivateCar");
        PrivateCar privateCar = (PrivateCar)clazz.newInstance();

        //访问private变量
        Field colorField = clazz.getDeclaredField("color");
        colorField.setAccessible(true);
        colorField.set(privateCar, "red");

        //访问方法
        Method drive = clazz.getDeclaredMethod("drive");
        drive.setAccessible(true);
        drive.invoke(privateCar);

    }
}
