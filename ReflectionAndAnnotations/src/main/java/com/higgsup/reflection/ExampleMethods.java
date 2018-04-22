package com.higgsup.reflection;

import com.higgsup.reflection.entity.DogVip;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ExampleMethods {
    public static void main(String[] args) {
        try {
            Class<?> classDogVip = Class.forName("com.higgsup.reflection.entity.DogVip");
            Field methodss = classDogVip.getDeclaredField("type2");

            Method[] methodsss = classDogVip.getDeclaredMethods();
            ;


            DogVip dogVip = new DogVip();
            dogVip.setLoai("Test get methods");

            Method[] methods = classDogVip.getMethods();

            for (Method method : methods
                    ) {
                System.out.println(method.getName());

                if (method.getName().equals("setTest")) {
                    // nêu methods là một static thì tham số 1 có thể là null để gọi trực tiếp.
                    method.invoke(dogVip, new Integer(2));
                }

                if (method.getName().equals("getLoai")) {
                    System.out.println(method.invoke(dogVip));


                    Class<?> returnType = method.getReturnType();
                    System.out.println("type trả về " + returnType.getName());

                    System.out.println("\n");
                }
                System.out.println("method k phải get hay set : " + method.getName());
            }
            System.out.println("Test setTest : " + dogVip.getTest());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
