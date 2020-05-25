package cn.edu.designpattern.command;

/**
 * @Author: DDG
 * @Date: 2020/5/5 10:23
 * @Description: 命令模式
 */
public class Client {
    public static void main(String[] args) {
        // 进行操作：
        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 进行遥控器的创建
        RemoteController remoteController = new RemoteController();
        // 进行命令的设置：
        remoteController.setCommands(0, lightOnCommand, lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

    }
}
