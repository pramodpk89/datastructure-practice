package com.ppk.dsa.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++) {
            Runnable runner=new PrintingThread();
            executor.execute(runner);
        }
        executor.shutdown();
    }
}
