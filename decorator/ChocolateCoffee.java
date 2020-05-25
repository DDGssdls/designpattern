package cn.edu.designpattern.decorator;

public class ChocolateCoffee extends Decorator {

    public ChocolateCoffee(Drink drink) {
        super(drink);
        // 进行自身信息的设置
        setDes("一个巧克力");
        setPrice(3.0f);
    }
}
