package cn.edu.designpattern.template;

/**
 * @Author: DDG
 * @Date: 2020/5/5 09:48
 * @Description:
 */
public class BlackBeanSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        System.out.println("添加的是黑豆");
    }
}
