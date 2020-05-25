package cn.edu.designpattern.adapter;

public class VoltageAdaptre extends Voltage implements Voltage5 {
    @Override
    public int get5() {// 这种形式是类适配器 但是 这种形式 比较的有趣诶点 一种就是 java中的类的单继承问题
        // 2就是 被适配类中的方法需要暴露出来 为了解决上面的问题 使用的是对象适配模式
        // 获取原有的电压
        int v220 = getV220();
        //进行适配
        int src = v220 / 44;
        return src;
    }
}
