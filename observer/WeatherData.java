package cn.edu.designpattern.observer;

import java.util.ArrayList;

/**
 * @Author: DDG
 * @Date: 2020/5/7 11:33
 * @Description:
 */
public class WeatherData implements Subject{

    private Weather weather;

    private ArrayList<Observer> observers;

    public WeatherData(Weather weather) {
        this.weather = weather;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o))
        observers.remove(o);
    }
    // 进行自身的属性的修改
    public void setData(Weather weather){
        this.weather = weather;
        // 通知第三方的进行修改
        dataChange();
    }

    private void dataChange() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update(weather));
    }
}
