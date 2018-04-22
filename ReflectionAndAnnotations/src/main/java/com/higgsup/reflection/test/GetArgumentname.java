package com.higgsup.reflection.test;

import com.higgsup.reflection.entity.DogVip;

import java.lang.reflect.Method;
import java.util.Arrays;

public class GetArgumentname {
    public static void main(String[] args) {
        try {
            Method method = DogVip.class.getMethod("dogKeu", String.class);
            Arrays.stream(method.getParameterTypes()).forEach(p -> System.out.println(p.getName()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
