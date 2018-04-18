package com.higgsup.Reflection.test;

import com.higgsup.Reflection.entity.DogVip;

public class GetClassObject {
    public static void main(String[] args) {
        System.out.println(DogVip.class.getCanonicalName());

        System.out.println(boolean.class.getCanonicalName());
    }
}
