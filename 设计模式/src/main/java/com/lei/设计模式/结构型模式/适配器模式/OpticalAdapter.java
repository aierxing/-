package com.lei.设计模式.结构型模式.适配器模式;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-22 9:10
 */ //光能适配器
public class OpticalAdapter implements Motor
{
    private OpticalMotor omotor;
    public OpticalAdapter()
    {
        omotor=new OpticalMotor();
    }
    public void drive()
    {
        omotor.opticalDrive();
    }
}
