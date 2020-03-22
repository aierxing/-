package com.lei.设计模式.结构型模式.适配器模式;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-22 9:11
 */ //电能适配器
public class ElectricAdapter implements Motor
{
    private ElectricMotor emotor;
    public ElectricAdapter()
    {
        emotor=new ElectricMotor();
    }
    public void drive()
    {
        emotor.electricDrive();
    }
}
