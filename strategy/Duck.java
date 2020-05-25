package cn.edu.designpattern.strategy;

/**
 * @Author: DDG
 * @Date: 2020/5/9 13:04
 * @Description: Duck 接口
 */
public abstract class Duck {

    private Fly fly;

    public Duck() {

    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }

    public abstract void display();

     void quack(){
        System.out.println("鸭子嘎嘎叫");
    }
     void swim(){
        System.out.println("鸭子会游泳");
    }
     void fly(){ if (fly != null)fly.fly(); };
}
