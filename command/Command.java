package cn.edu.designpattern.command;

public interface Command {
    // 执行操作：
    void execute();
    // 撤销操作：
    void undo();
}
