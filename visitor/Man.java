package cn.edu.designpattern.visitor;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:10
 * @Description:
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}

