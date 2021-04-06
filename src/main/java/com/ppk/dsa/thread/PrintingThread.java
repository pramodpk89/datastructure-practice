package com.ppk.dsa.thread;

public class PrintingThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ">> start");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + ">> end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
