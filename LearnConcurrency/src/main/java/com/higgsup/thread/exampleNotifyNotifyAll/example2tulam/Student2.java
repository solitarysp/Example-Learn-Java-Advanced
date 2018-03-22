package com.higgsup.thread.exampleNotifyNotifyAll.example2tulam;/*
  By Chi Can Em  18-03-2018
 */

public class Student2 extends Thread {
    private Student student;

    public Student2(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        synchronized (this.student) {
            System.out.println("cho thread " + getName() + " vào trạng thái Waiting");
            try {
                this.student.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("cho thread " + getName() + " thoát khỏi trạng thái Waiting");
        }
    }
}
