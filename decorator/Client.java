package cn.edu.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Client {

    public static void main(String[] args) throws FileNotFoundException {
        // 创建一个 使用两份巧克力 和 一份牛奶的coffee
        ChocolateCoffee chocolateCoffee = new ChocolateCoffee(new ChocolateCoffee(new MilkCoffee(new LongBlack())));
        float cost = chocolateCoffee.cost();
        String des = chocolateCoffee.getDes();
        System.out.println(des);
        System.out.println(cost);
        new BufferedInputStream(new FileInputStream("/src"));

    }
}
