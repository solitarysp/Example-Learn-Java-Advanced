package com.higgsup.stackAndHeapError;/*
  By Chi Can Em  22-03-2018
 */

public class Main {
    public static void main(String[] args) {
        outOfMemoryError();
    }

    public static void stackOverflowError() {
        int a = 10000;
        stackOverflowError();
    }

    public static void outOfMemoryError() {
        Integer x = 100000 * 1000000;
        String a = x.toString();
        while (true) {
            a += a;
        }
    }
}
