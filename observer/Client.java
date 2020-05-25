package cn.edu.designpattern.observer;

/**
 * @Author: DDG
 * @Date: 2020/5/7 11:06
 * @Description: 观察者模式 实现
 */
public class Client {
    public static void main(String[] args) {
        Weather weather = new Weather(100F, 101F, 20F);
        WeatherData subject = new WeatherData(weather);
        for (int i = 0; i < 10; i++) {
            subject.registerObserver(new CurrentConditions(i));
        }
        subject.notifyObservers();
        subject.setData(new Weather(1F, 1F, 1F));
        System.out.println("====================");
        subject.removeObserver(new CurrentConditions(4));
        subject.notifyObservers();

    }
}
