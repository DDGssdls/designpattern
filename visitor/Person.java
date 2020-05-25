package cn.edu.designpattern.visitor;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:07
 * @Description:
 */
public abstract class Person {

    public abstract void accept(Action action);
}
