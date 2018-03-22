package com.higgsup.stringpool;/*
  By Chi Can Em  22-03-2018
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int x = 10;
            Integer y = 10;
            Boolean b = x == y.intValue();
            System.out.println(b);
        }
    }

    public static void testDouble() {
        Double d1 = 1D;
        Double d2 = 1D;
        System.out.println(d1.doubleValue() == d2.doubleValue());
        System.out.println(d1.equals(d2));
        Double d3 = new Double(1);

        System.out.println(d1.doubleValue() == d3.doubleValue());

        Double d4 = new Double(1);

        System.out.println(d4 == d3);
    }

    public static void testPoolString() {
        String s1 = "thanh";
        String s2 = "thanh";
        System.out.println(s1 == s2);
        String s3 = new String("thanh");
        System.out.println(s1 == s3);
        String s4 = new String("thanh");
        System.out.println(s4 == s3);


    }
}
