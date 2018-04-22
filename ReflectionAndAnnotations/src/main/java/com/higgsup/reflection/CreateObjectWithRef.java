package com.higgsup.reflection;

import com.higgsup.reflection.entity.DogVip;

public class CreateObjectWithRef {
    public static void main(String[] args) {
        try {
            DogVip dogVip = DogVip.class.newInstance();
            dogVip.setAge(1);
            System.out.println(dogVip.getAge());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
