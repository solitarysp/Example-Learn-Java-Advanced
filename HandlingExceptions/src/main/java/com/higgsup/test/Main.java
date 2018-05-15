package com.higgsup.test;

public class Main {
    public static void main(String[] args) {
        try {
            // vẫn bắt đc nhưng k nên bắt
            test();
        } catch (Error e) {
            e.getStackTrace();
        } finally {
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
    public static void test(){
        test();
    }
}
