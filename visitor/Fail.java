package cn.edu.designpattern.visitor;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:09
 * @Description:
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价是很失败!");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价是很失败!");
    }
}
