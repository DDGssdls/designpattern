package cn.edu.designpattern.decorator;

public class MilkCoffee extends Decorator {

    public MilkCoffee(Drink drink) {
        super(drink);
        // 进行自身信息的设置
        setDes("一个牛奶");
        setPrice(2.0f);
    }
}
