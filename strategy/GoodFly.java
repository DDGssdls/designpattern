package cn.edu.designpattern.strategy;

/**
 * @Author: DDG
 * @Date: 2020/5/9 13:11
 * @Description:
 */
public class GoodFly implements Fly {
    @Override
    public void fly() {
        System.out.println("good fly");
    }
}
