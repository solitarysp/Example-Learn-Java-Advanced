package com.higgsup.thread.Atomic;/*
  By Chi Can Em  16-03-2018
 */

public class BinhThuong extends Thread {
    private Count count;

    public Count getCount() {
        return count;
    }

    public void setCount(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(count.countSumOne());
            System.out.println(count.countSumOne2());

        }
    }

    public static void main(String[] args) {
        Count count = new Count();
        count.setCount(0);
        BinhThuong atomicInteger = new BinhThuong();
        atomicInteger.setCount(count);

        BinhThuong atomicInteger1 = new BinhThuong();
        atomicInteger1.setCount(count);

        Thread thread = new Thread(atomicInteger);
        Thread thread1 = new Thread(atomicInteger1);
        thread.start();
        thread1.start();
    }


}

class Count {
    private int count;

    public synchronized int countSumOne(){
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    public synchronized int countSumOne2(){
        count++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}