package cn.edu.designpattern.mediator;

/**
 * @Author: DDG
 * @Date: 2020/5/7 12:46
 * @Description:
 */
public abstract class Colleague {
    private String name;

    private Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(int stateChange);
}
