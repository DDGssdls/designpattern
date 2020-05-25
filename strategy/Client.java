package cn.edu.designpattern.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: DDG
 * @Date: 2020/5/9 13:03
 * @Description: 策略模式：就是少用继承 而是使用聚合 和 组合
 */
public class Client {
    public static void main(String[] args) {
       /* Duck duck = new BjDuck();
        duck.display();
        duck.fly();
        duck = new WildDuck();
        duck.fly();
        duck.display();
        duck.setFly(new BadFly());
        duck.fly();*/
        int[] data = {9, 1, 2, 8, 4, 3};
        List<Integer> collect = Arrays.stream(data).boxed().sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());
        System.out.println(collect);
    }
}
