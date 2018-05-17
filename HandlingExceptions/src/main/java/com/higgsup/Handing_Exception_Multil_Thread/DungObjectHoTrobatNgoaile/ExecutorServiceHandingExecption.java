package com.higgsup.Handing_Exception_Multil_Thread.DungObjectHoTrobatNgoaile;

import java.util.concurrent.*;

public class ExecutorServiceHandingExecption {
    public static void main(String[] args) {
        ExecutorService exectorService=Executors.newSingleThreadExecutor();
        Runnable runnable=new Student1();
        Future future = exectorService.submit(runnable);
        try {
            future.get();
        } catch (Exception e) {
            System.out.println("d");
        }
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
        System.out.println("s");
    }
}

class Student1 implements Runnable {

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("lỗi");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new ArithmeticException();
    }
}
