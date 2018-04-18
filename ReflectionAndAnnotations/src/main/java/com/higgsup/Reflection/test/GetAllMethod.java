package com.higgsup.Reflection.test;

import com.higgsup.Reflection.entity.DogVip;

import java.lang.reflect.Method;

public class GetAllMethod {

    public static void main(String[] args) {
// what is getMethods?
        // lấy ra tất cả các methods trong class, kê thừa..vv..
        Class<DogVip> a = DogVip.class;
        // lấy ra list những methods có trong class , cả kế thừa..vv..
        Method[] methods = a.getMethods();

        for (Method method : methods
                ) {
            // hiển thị tên methods
            System.out.print(method.getName() + "    ==>> ");
            // hiển thị kết quả trả về
            System.out.println(method.getGenericReturnType());
        }
        // sẽ hiển thị 3 lần wait vì ở Object cha. có 3 method wait với là overload.

    }

}
