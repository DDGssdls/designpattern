package cn.edu.designpattern.bridge;

public abstract class Phone {
    // 这是手机所有的方法
    abstract void open();
    abstract void close();
    abstract void call();

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;

    }
    protected  void getBrand(){
        brand.getBrand();
    }
    protected  void gettype(){
        brand.gettype();
    }
}
