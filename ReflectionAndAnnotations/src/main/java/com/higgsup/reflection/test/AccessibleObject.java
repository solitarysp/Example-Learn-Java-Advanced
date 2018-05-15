package com.higgsup.reflection.test;

import com.higgsup.reflection.entity.DogVip;

import java.lang.reflect.Field;

public class AccessibleObject {
    public static void main(String[] args) {
        try {
            DogVip dogVip = new DogVip();

            // lấy biến  private
            Field field = DogVip.class.getDeclaredField("test");

            // sét quyển truy cập, nếu k sét sẽ throw ra lỗi
            field.setAccessible(true);

            // gắn dữ liệu
            field.set(dogVip, 1);
            System.out.println(dogVip.getTest());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
