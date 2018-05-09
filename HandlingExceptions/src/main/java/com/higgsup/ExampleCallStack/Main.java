package com.higgsup.ExampleCallStack;

public class Main {
    public static void main(String[] args) {
        runMethod1();
    }

    private static void runMethod1() {
        try {
            runMethod2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void runMethod2() throws Exception {
        runMethod3();
    }

    private static void runMethod3() throws Exception {
        //method sẩy ra lỗi
        throw new Exception("some thing");
    }
}
