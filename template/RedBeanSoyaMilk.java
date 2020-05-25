package cn.edu.designpattern.template;

/**
 * @Author: DDG
 * @Date: 2020/5/5 09:48
 * @Description:
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    public void add() {
        System.out.println("添加的是红豆");
    }
}
