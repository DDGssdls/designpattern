package cn.edu.designpattern.mediator;

/**
 * @Author: DDG
 * @Date: 2020/5/7 12:49
 * @Description:
 */
public class Alarm extends Colleague {
    public Alarm(String name, Mediator mediator) {
        super(name, mediator);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }
}
