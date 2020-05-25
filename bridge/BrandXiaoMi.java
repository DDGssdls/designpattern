package cn.edu.designpattern.bridge;

public class BrandXiaoMi implements Brand {
    @Override
    public Brand getBrand() {
        System.out.println("这是一种小米手机");
        return new BrandXiaoMi();
    }

    @Override
    public void gettype() {
        System.out.println("小米手机的全面屏");
    }
}
