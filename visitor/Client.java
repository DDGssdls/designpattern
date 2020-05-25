package cn.edu.designpattern.visitor;

/**
 * @Author: DDG
 * @Date: 2020/5/6 09:47
 * @Description: 访问者模式：就是在被访问的类中添加一个对外提供接待访问者的接口 需要注意的就是
 * 访问者可以进行扩展 但是 element不能进行扩展
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();

        structure.attach(new Man());
        structure.attach(new Woman());

        structure.display(new Fail());
        structure.display(new Success());
        Action action = new Success();
        action.getWomanResult(new Woman());
        action.getWomanResult(new Woman());
        action.getWomanResult(new Woman());
        action.getWomanResult(new Woman());
        Woman woman = new Woman();
        System.out.println("111");
        woman.accept(action);
    }

}
