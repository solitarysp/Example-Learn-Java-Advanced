package com.higgsup.reflection;


import com.higgsup.reflection.entity.DogVip;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateFieldAndMethod {
    public static void main(String[] args) {
        try {
            Class<?> classDogVip = Class.forName("com.higgsup.reflection.entity.DogVip");

            DogVip dogVip = new DogVip();
            testAccessingPrivateMethod(dogVip, classDogVip);
            testAccessingPrivateField(dogVip, classDogVip);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testAccessingPrivateMethod(DogVip dogVip, Class<?> classDogVip) {
        Method method = null;
        try {
            method = classDogVip.getDeclaredMethod("testMethodPrivate");
            method.setAccessible(true);
            method.invoke(dogVip, null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    private static void testAccessingPrivateField(DogVip dogVip, Class<?> classDogVip) {
        try {
            Field field = classDogVip.getDeclaredField("type");
            field.setAccessible(true);
            field.set(dogVip, "Test 111");

            System.out.println(field.get(dogVip));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
