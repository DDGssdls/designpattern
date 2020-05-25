package cn.edu.designpattern.decorator;

public abstract class Drink {

    public String des;// coffee的描述

    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // 类中的核心方法： 就是计算价格的方法 由子类实现
    public abstract float cost();
}
