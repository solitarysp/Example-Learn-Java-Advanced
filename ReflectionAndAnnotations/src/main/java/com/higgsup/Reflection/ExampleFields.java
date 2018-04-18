package com.higgsup.Reflection;

import com.higgsup.Reflection.entity.DogVip;

import java.lang.reflect.Field;

public class ExampleFields {
    public static void main(String[] args)  {
        Class<?> classDogVip = null;
        try {
            classDogVip = Class.forName("com.higgsup.Reflection.entity.DogVip");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\n  getFields\n");

        // lấy ra tất cả các thuộc tính public kể cả kế thừa
        Field[] fields = classDogVip.getFields();
        for (Field field : fields
                ) {
            System.out.print(" name  :" + field.getName());
            System.out.println(" type  :" + field.getType().getName());

        }
        System.out.println("\n  getDeclaredFields\n");
        // lấy tất cả các thuộc tính của class  này, dù là private cũng lấy được nhưng k lấy ở kế thừa.

        Field[] declaredFields = classDogVip.getDeclaredFields();
        for (Field field : declaredFields
                ) {
            System.out.print(" name  :" + field.getName());
            System.out.println(" type  :" + field.getType().getName());
        }

        System.out.println("\n  get và set Field private \n");
        // sét và get value với Field
        DogVip dogVip = new DogVip();
        Field fieldTest = null;
        try {
            fieldTest = classDogVip.getDeclaredField("Test");
            fieldTest.setAccessible(true);
            fieldTest.set(dogVip, new Integer(2));
            System.out.println(fieldTest.get(dogVip));;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
