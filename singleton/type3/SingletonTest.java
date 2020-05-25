package cn.edu.designpattern.singleton.type3;

public class SingletonTest {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
    }
}
// 单利模式的第三种实现方式 double check
class Singleton{
    // 使用双重检查 来实现单利模式 推荐使用
    private static volatile Singleton singleton;
    // 构造器私有：
    private Singleton(){}
    // 共有的实例化方法
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
