package cn.edu.designpattern.mediator;

import cn.edu.designpattern.observer.Weather;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: DDG
 * @Date: 2020/5/7 12:23
 * @Description: 中介者模式： 就是使用一个中介对象来封装一系列的对象的交互  中介者使得各个对象之间不需要显示的进行交互
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<Weather> weathers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            weathers.add(new Weather(i, i + 1, i));
        }
        // 前两个参数一个就是作为 key 另一个就是作为 value 第三个参数就是 要是出现冲突用哪个
        Map<Float, Float> collect = weathers.stream().collect(Collectors.toMap(Weather::getPressure, Weather::getHumidity, (w1, w2) -> w1));
        collect.keySet().stream().forEach((key) ->{
            System.out.println(key+"="+collect.get(key));
        });
        HashSet<Weather> collect1 = (HashSet<Weather>) weathers.stream().collect(Collectors.toSet());
        long l = System.nanoTime();
        collect1.stream().forEach(System.out::println);
        long l1 = System.nanoTime();
        long l2 = System.nanoTime();
        Iterator<Weather> iterator = collect1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        long l3 = System.nanoTime();
        System.out.println(l3 - l2);
        
        System.out.println(l1 - l);
    }
}
