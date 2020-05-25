package cn.edu.designpattern.factory.simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备做奶酪披萨！");
    }
}
