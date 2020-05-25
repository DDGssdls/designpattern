package cn.edu.designpattern.adapter;

public class Voltage {// 创建一个被适配者 这里就是 220v电压

    private int v = 220;// 原本的电压就是220v

    public int getV220(){
        //System.out.println(v);
        return v;
    }


}
