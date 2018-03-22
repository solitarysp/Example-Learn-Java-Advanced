package com.higgsup.PassingVariablesAndObjectsBetweenMethods;/*
  By Chi Can Em  22-03-2018
 */

public class PassingVariablesAndObjectsBetweenMethods {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        Dog aDog = new Dog("Max");
        System.out.println(aDog.hashCode());

        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true, java passes by value
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog.hashCode());
    }

    public static void foo(Dog d) {
        d.getName().equals("Max"); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");
        d.getName().equals("Fifi"); // true
        System.out.println(d.hashCode());
    }


    public static void test2() {
        Dog aDog = new Dog("Max");
        System.out.println(aDog.hashCode());

        // we pass the object to foo
        foo2(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true, java passes by value
        System.out.println(aDog.getName().equals("Fifi")); // false
        System.out.println(aDog.hashCode());
    }

    public static void foo2(Dog d) {
        d.getName().equals("Max"); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }
}
