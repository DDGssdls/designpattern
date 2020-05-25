package cn.edu.designpattern.visitor;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:10
 * @Description: 使用的是双分派 首先就是将具体的参数状态传入到woman中  然后再类中调用作为参数的具体方法
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
