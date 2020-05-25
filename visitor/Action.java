package cn.edu.designpattern.visitor;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:05
 * @Description:
 */
public abstract class Action {
    // 进行测评：

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
