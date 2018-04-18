package com.higgsup.Reflection;

import com.higgsup.Reflection.entity.DogVip;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ExampleConstructor {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> classDogVip = Class.forName("com.higgsup.Reflection.entity.DogVip");

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
