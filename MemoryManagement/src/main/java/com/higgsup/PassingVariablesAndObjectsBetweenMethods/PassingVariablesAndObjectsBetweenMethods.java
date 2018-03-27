package com.higgsup.PassingVariablesAndObjectsBetweenMethods;/*
  By Chi Can Em  22-03-2018
 */

public class PassingVariablesAndObjectsBetweenMethods {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        Dog aDog = new Dog("Chó đỏ");
        System.out.println(aDog.hashCode());

        foo(aDog);
        System.out.println(aDog.getName().equals("Chó đỏ"));
        System.out.println(aDog.getName().equals("Chó xanh"));
        System.out.println(aDog.hashCode());
    }

    public static void foo(Dog d) {
        d.getName().equals("Chó đỏ"); // true
        d = new Dog("Chó xanh");//false
        d.getName().equals("Chó xanh"); // true
        System.out.println(d.hashCode());
    }


    public static void test2() {
        Dog aDog = new Dog("Chó đỏ");
        System.out.println(aDog.hashCode());

        foo2(aDog);

        System.out.println(aDog.getName().equals("Chó đỏ"));
        System.out.println(aDog.getName().equals("Chó xanh"));
        System.out.println(aDog.hashCode());
    }

    public static void foo2(Dog d) {
        d.getName().equals("Chó đỏ");
        d.setName("Chó xanh");
    }
}
