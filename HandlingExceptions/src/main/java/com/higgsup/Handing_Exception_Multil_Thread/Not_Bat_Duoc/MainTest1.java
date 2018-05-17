package com.higgsup.Handing_Exception_Multil_Thread.Not_Bat_Duoc;

public class MainTest1 {
    public static void main(String[] args) {
        try {
            Runnable runnable = new Thread(new Student());
            Thread thread = new Thread(runnable);
            thread.start();
        } catch (Exception e) {
            System.out.println("bắt exception");
        }finally {
            System.out.println("finally");
        }
    }
}
class Student implements Runnable {
    public int throwException() {
        System.out.println("throw exception");
        throw new ArithmeticException();
    }
    public void run() {
        throwException();
    }
}

