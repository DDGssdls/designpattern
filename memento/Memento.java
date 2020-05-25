package cn.edu.designpattern.memento;

/**
 * @Author: DDG
 * @Date: 2020/5/8 10:11
 * @Description:
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
