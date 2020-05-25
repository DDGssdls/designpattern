package cn.edu.designpattern.bridge;

public class PhoneXiaoMi extends Phone {

    public PhoneXiaoMi(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("小米手机开机了");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机了");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话了");
    }
}
