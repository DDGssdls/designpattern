package cn.edu.designpattern.bridge;

public class BrandIPhone implements Brand {
    @Override
    public Brand getBrand() {
        System.out.println("这是一种苹果手机");
        return new BrandIPhone();
    }

    @Override
    public void gettype() {
        System.out.println("苹果手机有折叠的类型 和 全面屏的类型");
    }
}
