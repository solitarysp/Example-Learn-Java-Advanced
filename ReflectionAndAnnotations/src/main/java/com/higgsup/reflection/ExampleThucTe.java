package com.higgsup.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ExampleThucTe {
    private String var1;
    private Integer var2;

    public static void main(String[] args) {
        Object o = example2(Double.class, "123");

        System.out.println("d");
    }

    private static Object example2(Class<?> aClass, String value) {
        Object o = null;
        try {
            Constructor<?> constructor = aClass.getConstructor(new Class[]{String.class});
            o = constructor.newInstance(new Object[]{value});
            return o;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return o;
    }

    private static void example1() {
        ExampleThucTe exampleThucTe = new ExampleThucTe();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("var2", 1);
        map.put("var1", "test");

        for (Map.Entry<String, Object> item : map.entrySet()
                ) {
            try {
                Field field = ExampleThucTe.class.getDeclaredField(item.getKey());
                field.setAccessible(true);
                field.set(exampleThucTe, item.getValue());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        System.out.println(exampleThucTe.var1 + " " + exampleThucTe.var2);
    }


}
