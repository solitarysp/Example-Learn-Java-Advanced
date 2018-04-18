package com.higgsup.Reflection.test;

import com.higgsup.Reflection.entity.DogVip;

import java.lang.reflect.Field;

public class GetField {
    //what is Field
    //Field là những biến trong class được khai báo public
    public static void main(String[] args) {
        // lấy ra class
        Class<DogVip> dogVipClass = DogVip.class;
        // lấy ra list các Field có trong class và các kế thừa
        Field[] fields = dogVipClass.getFields();

        for (Field field : fields) {
            // hiển thị các Field
            System.out.println(field.getName());

        }

        try {
            // tìm theo tên nếu k thấy sẽ throws NoSuchFieldException
            Field field = dogVipClass.getField("test");
            System.out.println(field.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
