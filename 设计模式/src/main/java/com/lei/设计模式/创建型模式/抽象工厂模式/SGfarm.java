package com.lei.设计模式.创建型模式.抽象工厂模式;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-03-22 8:06
 */ //具体工厂：韶关农场类
public class SGfarm implements Farm
{
    public Animal newAnimal()
    {
        System.out.println("新牛出生！");
        return new Cattle();
    }
    public Plant newPlant()
    {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
