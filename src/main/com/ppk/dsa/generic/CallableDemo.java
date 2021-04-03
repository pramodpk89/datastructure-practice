package com.ppk.dsa.generic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) throws Exception {

        ExecutorService service= Executors.newSingleThreadExecutor();
        System.out.println(Thread.currentThread().getName()+" Starting via executor service");
        Future future=service.submit(new waitReturnTime());
        System.out.println(Thread.currentThread().getName()+" it returned "+future.get());
        service.shutdown();
    }
}


class waitReturnTime implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" Waiting");
        Thread.sleep(3000);
        return System.currentTimeMillis();
    }
}