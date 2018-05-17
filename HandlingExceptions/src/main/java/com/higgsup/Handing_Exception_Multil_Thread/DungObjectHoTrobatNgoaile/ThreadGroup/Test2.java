package com.higgsup.Handing_Exception_Multil_Thread.DungObjectHoTrobatNgoaile.ThreadGroup;

public class Test2 {
    public static void main(String[] args) {
        MyThreadGroup threadGroup = new MyThreadGroup("bắt ngoại lệ");
        Thread thread = new Thread(threadGroup, new Student3());
        Thread thread2 = new Thread(threadGroup, new Student3());
        Thread thread3 = new Thread(threadGroup, new Student3());
        Thread thread4 = new Thread(threadGroup, new Student3());
        Thread thread5 = new Thread(threadGroup, new Student3());

        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}

class Student3 extends Thread {
    public int throwException() {
        System.out.println("throw exception");
        throw new ArithmeticException();
    }

    @Override
    public void run() {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("bắt đc ngoại lệ trong run");
            throw new ArithmeticException();
        }
    }
}