package cn.edu.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: DDG
 * @Date: 2020/5/8 10:17
 * @Description:
 */
public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
