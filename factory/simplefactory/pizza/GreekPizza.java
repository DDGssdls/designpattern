package cn.edu.designpattern.factory.simplefactory.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备做Greek披萨！");
    }
}
