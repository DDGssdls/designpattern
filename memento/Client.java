package cn.edu.designpattern.memento;

/**
 * @Author: DDG
 * @Date: 2020/5/8 10:03
 * @Description: 备忘录模式：就是在不破坏封装的前提下 获取一个对象的内部状态：主要的一点就是在这个对象之外保存这个状态
 * 这样的话之后就能将对象恢复到保存的原先的状态上 行为模式：
 */
public class Client {

    public static void main(String[] args) {
         Originator originator = new Originator("状态1");
        CareTaker careTaker = new CareTaker();
        careTaker.add(originator.saveState());
        originator.setState("状态2");
        careTaker.add(originator.saveState());
        originator.setState("状态3");
        careTaker.add(originator.saveState());
        // 现在保存的就是三种状态 现在恢复到状态1
        originator.getMementoState(careTaker.get(0));
        System.out.println(originator.getState());

    }
}
