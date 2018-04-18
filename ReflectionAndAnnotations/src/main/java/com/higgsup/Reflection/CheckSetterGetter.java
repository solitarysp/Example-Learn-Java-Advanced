package com.higgsup.Reflection;

import com.higgsup.Reflection.entity.DogVip;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CheckSetterGetter {
    public static void main(String[] args) {
        try {
            Class<?> classDogVip = Class.forName("com.higgsup.Reflection.entity.DogVip");

            Method[] methods = classDogVip.getMethods();
            DogVip dogVip = new DogVip();
            dogVip.setType("Test get methods");


            for (Method method : methods
                    ) {
                if (isSetter(method)) {
                    System.out.println(method.getName() + " là settter");
                }
                if (isGetter(method)) {
                    System.out.println(method.getName() + " là gettter");
                }
            }
            System.out.println("Test setTest : " + dogVip.getTest());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isSetter(Method method) {
        // check từ set bắt đầu tên method
        if (!method.getName().startsWith("set")) {
            return false;
        }
        // check tham số truyền vào phải hơn 1
        if (method.getParameterTypes().length != 1) {
            return false;
        }
        return true;
    }

    public static boolean isGetter(Method method) {
        // check từ get bắt đầu tên method
        if (!method.getName().startsWith("get")) {
            return false;
        }

        // vì getter k có tham số truyền nên check xem có tham số k.
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        // check kiểu tra về là void thì k phải getter
        if ("void".equals(method.getReturnType().getName())) {
            return false;
        }
        return true;
    }
}
