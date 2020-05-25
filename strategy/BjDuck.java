package cn.edu.designpattern.strategy;

/**
 * @Author: DDG
 * @Date: 2020/5/9 13:16
 * @Description:
 */
public class BjDuck extends Duck {
    public BjDuck() {
        this.setFly(new JustSoSoFly());
    }

    @Override
    public void display() {
        System.out.println("这是一种Bj的鸭子");
    }


}
