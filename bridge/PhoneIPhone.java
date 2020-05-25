package cn.edu.designpattern.bridge;

public class PhoneIPhone extends Phone {

    public PhoneIPhone(Brand brand) {
        super(brand);
        brand.gettype();
        brand.getBrand();
    }

    @Override
    public void open() {

        System.out.println("苹果手机开机了");
    }

    @Override
    public void close() {
        System.out.println("苹果手机关机了");
    }

    @Override
    public void call() {
        System.out.println("苹果手机打电话了");
    }
}
