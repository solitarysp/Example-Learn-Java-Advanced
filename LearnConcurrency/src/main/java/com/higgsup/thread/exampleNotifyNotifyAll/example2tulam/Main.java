package com.higgsup.thread.exampleNotifyNotifyAll.example2tulam;/*
  By Chi Can Em  18-03-2018
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Student student = new Student();

        Student1 student1 = new Student1(student);
        Student2 student2 = new Student2(student);

        StudentNotify studentNotify = new StudentNotify(student);

        Thread thread1 = new Thread(student1);
        thread1.setName("thread 1: ");

        Thread thread2 = new Thread(student2);
        thread2.setName("thread 2: ");

        Thread thread3 = new Thread(studentNotify);

        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        thread3.start();
    }
}
