package cn.edu.designpattern.bridge;

public class BrandHuaWei implements Brand {
    @Override
    public Brand getBrand() {
        System.out.println("这是一种华为手机");
        return new BrandHuaWei();
    }

    @Override
    public void gettype() {
        System.out.println("华为手机有折叠的类型 和 全面屏的类型");
    }
}
