package cn.edu.designpattern.bridge;

public class PhoneHuaWei extends Phone {

    public PhoneHuaWei(Brand brand) {
        super(brand);
        brand.gettype();
        brand.getBrand();
    }

    @Override
    public void open() {

        System.out.println("华为手机开机了");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机了");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话了");
    }
}
