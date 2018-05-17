package com.higgsup.Handing_Exception_Multil_Thread.DungObjectHoTrobatNgoaile;

public class MainTest1 {
    public static void main(String[] args) {
        Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread th, Throwable ex) {
                System.out.println("đã bắt đc ngoại lệ: " + ex);
            }
        };
        Thread thread = new Student();
        thread.setUncaughtExceptionHandler(h);
        thread.start();
    }
}
class Student extends Thread {
    public int throwException() {
        System.out.println("throw exception");
        throw new ArithmeticException();
    }
    @Override
    public void run() {
      try {
          throwException();
      }catch (Exception e){
          System.out.println("bắt đc ngoại lệ trong run");
          throw new ArithmeticException();
      }
    }
}
