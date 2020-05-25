package cn.edu.designpattern.command;

/**
 * @Author: DDG
 * @Date: 2020/5/5 10:48
 * @Description: 没有具体的实现 用于进行初始化
 *  使用这样的好处就是 可以省略对空的判断
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
