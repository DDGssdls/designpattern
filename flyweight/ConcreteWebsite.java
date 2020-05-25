package cn.edu.designpattern.flyweight;

/**
 * @Author: DDG
 * @Date: 2020/5/4 10:16
 * @Description:
 */
public class ConcreteWebsite implements Website {

    private String type;// 网站的类型

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("当前用户是：" + user.getName() + "网站的类型：" + type);
    }
}
