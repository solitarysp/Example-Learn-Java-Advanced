package com.higgsup.thread.TuTestExecutorService;/*
  By Chi Can Em  20-03-2018
 */

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorTest {
    private static final int NTHREADS =4;

    private static final Executor exec = Executors.newFixedThreadPool(NTHREADS);
    public static void main(String[] args) throws IOException {


         Runnable task = new Runnable() {

                public void run() {
                    System.out.println("1");
                }
            };

            exec.execute(task);


    }

}
