package cn.edu.designpattern.strategy;

/**
 * @Author: DDG
 * @Date: 2020/5/9 13:16
 * @Description:
 */
public class WildDuck extends Duck {
    public WildDuck() {
        this.setFly(new GoodFly());
    }

    @Override
    public void display() {
        System.out.println("这是一种野生的鸭子");
    }


}
