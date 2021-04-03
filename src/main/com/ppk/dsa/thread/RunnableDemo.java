package com.ppk.dsa.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
       Thread t1=new Thread(new waitAndPrint());
       t1.start();

        ExecutorService service= Executors.newSingleThreadExecutor();
        service.submit(new waitAndPrint());
        service.shutdown();
    }
}

class waitAndPrint implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Start of run");
        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName()+" Wait over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}