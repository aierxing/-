package com.lei.one;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-04-07 8:56
 */
public class Demo1 {

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();

        t1.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println("a:"+Thread1.a);
    }




}


class Thread1 extends Thread{
    public static AtomicInteger a = new  AtomicInteger();
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            a.getAndIncrement();
        }
        System.out.println("修改完毕");
    }
}
