package cn.edu.designpattern.command;

/**
 * @Author: DDG
 * @Date: 2020/5/5 10:52
 * @Description:
 */
public class RemoteController {
    // 执行开的命令
    private Command[] onCommands;
    // 执行关的命令
    private Command[] offCommands;
    // 进行命令的撤销

    private Command undoCommand;

    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        undoCommand = new NoCommand();

        for (int i = 0; i < 5; i++) {
            // 这就是使用空的命令进行初始化
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommands(int no, Command onCommand, Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }
    // 按下开按钮
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        // 将执行完成的操作进行记录 用于撤销
        undoCommand = onCommands[no];
    }
    // 按下关按钮
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        // 将执行完成的操作进行记录 用于撤销
        undoCommand = offCommands[no];
    }
    // 按下撤销命令：
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
