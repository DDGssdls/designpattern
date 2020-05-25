package cn.edu.designpattern.mediator;

/**
 * @Author: DDG
 * @Date: 2020/5/7 12:47
 * @Description:
 */
public abstract class Mediator {
    // 将中介者对象加入到集合中
    public abstract void register(String name, Colleague colleague);
    public abstract void getMessage(int stateChange, String name);
    public abstract void sendMessage();
}
