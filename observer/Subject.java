package cn.edu.designpattern.observer;

public interface Subject {

    // 接口中三种方法： 一种就是 进行观察者的注册 第二种就是 观察者的移出
    // 和 对所有的观察者进行通知的方法

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
