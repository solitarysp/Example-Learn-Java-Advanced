package com.higgsup.Reflection.test;

import com.higgsup.Reflection.entity.DogVip;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructor {
    public static void main(String[] args) {
        try {
            Constructor<DogVip> dogVipConstructor = DogVip.class.getConstructor(DogVip.class);
          dogVipConstructor.newInstance(1);
            System.out.println(dogVipConstructor.getParameterTypes());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
