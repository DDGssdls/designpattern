package cn.edu.designpattern.memento;

/**
 * @Author: DDG
 * @Date: 2020/5/8 10:10
 * @Description: 原始的 需要进行状态保存的类
 */
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    // 编写一个方法用于保存状态对象：获取要保存的状态 保存到Memento对象中
    public Memento saveState(){
        return new Memento(this.state);
    }
    // 就是用于状态的恢复
    public void getMementoState(Memento memento){
        this.state = memento.getState();
    }
}
