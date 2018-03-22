package com.higgsup.thread.Atomic;/*
  By Chi Can Em  16-03-2018
 */


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample extends Thread {
    private Count2 count;

    public Count2 getCount() {
        return count;
    }

    public void setCount(Count2 count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count.countSumOne1();
            System.out.println(count.getValue());

        }
    }

    public static void main(String[] args) {
        Count2 count = new Count2();
        count.setCount(0);
        AtomicIntegerExample atomicInteger = new AtomicIntegerExample();
        atomicInteger.setCount(count);

        AtomicInteger1 atomicInteger1 = new AtomicInteger1();
        atomicInteger1.setCount(count);

        Thread thread = new Thread(atomicInteger);
        Thread thread1 = new Thread(atomicInteger1);
        thread.start();
        thread1.start();
    }


}

class AtomicInteger1 extends Thread {
    private Count2 count;

    public Count2 getCount() {
        return count;
    }

    public void setCount(Count2 count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count.countSumOne();
            System.out.println(count.getValue());

        }
    }
}

class Count2 {
    private AtomicInteger count = new AtomicInteger();

    public void countSumOne() {
        count.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void countSumOne1() {
        count.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getValue() {
        return count.get();
    }

    public void setCount(int count) {
        this.count.set(count);
    }
}