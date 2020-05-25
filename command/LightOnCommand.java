package cn.edu.designpattern.command;

/**
 * @Author: DDG
 * @Date: 2020/5/5 10:40
 * @Description: 具体的命令 但是具体的命令执行 不是Command执行的而是 Receiver执行的 命令的接受着
 */
public class LightOnCommand implements Command {

    private LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
    // 根据具体的命令进行对应的接受者的执行 实现解耦
    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
