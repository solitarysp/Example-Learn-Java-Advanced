package com.higgsup.reflection.test;

import com.higgsup.reflection.entity.DogVip;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class EXAMPLEMethodHandles {
    public static void main(String[] args) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType= MethodType.methodType(void.class);

        try {
            MethodHandle methodHandle=lookup.findVirtual(DogVip.class,"dogKeu",methodType);
            DogVip dogVip=new DogVip();
            methodHandle.invoke(dogVip);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
