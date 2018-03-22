package com.higgsup.thread.TuTestExecutorService;/*
  By Chi Can Em  21-03-2018
 */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable {
    public static void main(String[] args){

    }
    public static void testCallable(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Object> future = executorService.submit(new java.util.concurrent.Callable() {
            @Override
            public Object call() throws Exception {
                return "test";
            }

        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
