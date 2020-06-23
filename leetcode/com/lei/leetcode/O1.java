package com.lei.leetcode;

/**
 * note-all
 *
 * @author: leiwe
 * @date 2020-06-16 11:45
 */
public class O1 {
    public static void main(String[] args){
        int a = 0;
        for (int i = 0;i<10;i++) {
            int x = i;
            Thread thread = new Thread(() -> {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
            thread.setName("lei - "+i);
            thread.start();
        }
    }
}
