package com.lei.内存回收;

import java.util.Date;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-04-10 6:49
 */
public class MyDate extends Date {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object [Date："+this.getTime()+"] is gc");
    }

    @Override
    public String toString() {
        return "Date："+this.getTime();
    }
}
