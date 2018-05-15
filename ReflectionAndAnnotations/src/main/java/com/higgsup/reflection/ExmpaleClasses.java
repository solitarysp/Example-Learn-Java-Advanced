package com.higgsup.reflection;

import com.higgsup.reflection.entity.DogVip;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class ExmpaleClasses {
    public static void main(String[] args) {
        try {
            Class<?> classDogVip = Class.forName("com.higgsup.reflection.entity.DogVip");


            System.out.println("Class Name");
            // lấy về  tên đầy đủ của class có cả package name
            System.out.println("Class Name có package " + classDogVip.getName());

            // chỉ lấy về tên class mà không lấy pacakge name
            System.out.println("Class Name không có package " + classDogVip.getSimpleName());


            // check Modifiers
            System.out.println("\nModifiers");

            int check = classDogVip.getModifiers();

            System.out.println("kiểm tra có phải Abstract hay không " + Modifier.isAbstract(check));
            System.out.println("kiểm tra có phải Final hay không " + Modifier.isFinal(check));
            System.out.println("kiểm tra có phải Interface hay không " + Modifier.isInterface(check));
            System.out.println("kiểm tra có phải là public hay không " + Modifier.isPublic(check));
            //còn nhiều cái nữa

            //Superclass
            System.out.println("\nSuperclass");
            // lấy về Superclass mà class này kết thừa
            Class<?> aClass = classDogVip.getSuperclass();
            System.out.println(aClass.getSimpleName());

            System.out.println("\nconstructors");
            Constructor<?>[] constructors = classDogVip.getConstructors();
            for (Constructor constructor : constructors
                    ) {
                System.out.println("\nconstructor cho DogVip");
                Class[] classes = constructor.getParameterTypes();
                for (Class aClass1 : classes
                        ) {
                    // nếu là constructors thì là constructors rỗng
                    System.out.println(aClass1.getSimpleName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
