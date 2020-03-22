package com.lei.设计模式.创建型模式.单例模式;

/**
 * 饿汉式单例
 */

public class HungrySingleton
{
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance()
    {
        return instance;
    }
}