package cn.edu.designpattern.decorator;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        // 进行的是自己的价格的计算 + 原有的计算
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        // 当前的描述就是原有的基础上 + 传入的描述
        return super.getDes() + super.getPrice()+"+"+ drink.getDes() ;
    }
}
