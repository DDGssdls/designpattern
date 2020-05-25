package cn.edu.designpattern.adapter;

public class VoltageAdaptre2  implements Voltage5 {

    private Voltage voltage;

    public VoltageAdaptre2(Voltage voltage){
        this.voltage = voltage;
    }
    @Override
    public int get5() {
        int v220 = voltage.getV220();
        //进行适配
        int src = v220 / 44;
        return src;
    }
}
