package cn.edu.designpattern.template;

/**
 * @Author: DDG
 * @Date: 2020/5/5 09:30
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();
        System.out.println("-----------------");
        SoyaMilk soyaMilk2 = new BlackBeanSoyaMilk();
        soyaMilk2.make();
        SoyaMilk soyaMilk1 = new PureSoyaMilk();
        soyaMilk1.make();
    }
}
