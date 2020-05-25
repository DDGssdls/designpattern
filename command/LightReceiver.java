package cn.edu.designpattern.command;

/**
 * @Author: DDG
 * @Date: 2020/5/5 10:42
 * @Description: 实现命令的对象
 */
public class LightReceiver {

    public void on(){
        System.out.println("点灯打开了");
    }
    public void off(){
        System.out.println("点灯关闭了");
    }
}
