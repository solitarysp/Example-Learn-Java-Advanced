package com.higgsup.thread.exampleNotifyNotifyAll.example2tulam;/*
  By Chi Can Em  18-03-2018
 */

public class StudentNotify extends Thread {
    private Student student;

    public StudentNotify(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        synchronized (this.student) {
            System.out.println("StudentNotify chạy câu lệnh");

            //this.student.notifyAll();
            this.student.notify();

        }
    }
}
