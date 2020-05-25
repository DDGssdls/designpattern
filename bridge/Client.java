package cn.edu.designpattern.bridge;

public class Client {

    public static void main(String[] args) {
        // 使用桥接的好处就是防止类爆炸
        Phone phoneHuaWei = new PhoneHuaWei(new BrandHuaWei());
        Phone phoneIPhone = new PhoneIPhone(new BrandIPhone());
        Phone phoneXiaoMi= new PhoneXiaoMi(new BrandXiaoMi());


        phoneHuaWei.call();
        phoneHuaWei.close();
        phoneHuaWei.open();
        phoneXiaoMi.call();
        phoneXiaoMi.close();
        phoneXiaoMi.open();
        phoneIPhone.call();
        phoneIPhone.close();
        phoneIPhone.open();
    }
}
