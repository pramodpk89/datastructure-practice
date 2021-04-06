package com.ppk.dsa.thread;


public class SyncronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        //Non synchronized block can lead to duplicate ID generation
        Runnable r1=()->{new IdGenerator().getID();};
        Thread t1=new Thread(r1,"First thread");
        Thread t2=new Thread(r1,"Second thread");
            t1.start();
            t2.start();


        // synchronized block
        Runnable r2=()->{new IdGenerator().getSyncID();};
        Thread t3=new Thread(r1,"Third thread");
        Thread t4=new Thread(r1,"Fourth thread");
        t3.start();
        t4.start();
    }
}

class IdGenerator {
    static int i=1;
     int getID() {
        System.out.println(Thread.currentThread().getName()+">>>> ID is "+i++);
        return i;
    }
    static int j=1;
   synchronized int getSyncID() {
        System.out.println(Thread.currentThread().getName()+">>>> ID is "+i++);
        return i;
    }
}