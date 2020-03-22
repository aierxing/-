package com.lei.设计模式.创建型模式.建造者模式;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-22 8:18
 */ //具体建造者：具体装修工人1
public class ConcreteDecorator1  extends Decorator
{
    public void buildWall()
    {
        product.setWall("w1");
    }
    public void buildTV()
    {
        product.setTV("TV1");
    }
    public void buildSofa()
    {
        product.setSofa("sf1");
    }
}
