package cn.edu.designpattern.adapter;

public class Phone {

    // 进行充电：使用的方法：
    public int charging(Voltage5 voltage){
        //System.out.println(voltage.get5());
        return voltage.get5();
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        int charging = phone.charging(new VoltageAdaptre());
        System.out.println(charging);

    }
}
