package com.higgsup.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExampleConstructor {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> classDogVip = Class.forName("com.higgsup.reflection.entity.DogVip");

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
    }
}
