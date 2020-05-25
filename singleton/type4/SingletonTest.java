package cn.edu.designpattern.singleton.type4;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);


    }
}

// 单利模式的第四种实现方式 静态内部类的形式（这样的方式也是推荐使用的）
// 使用的是类装载的机制（类在初始化的过程中 jvm保证了只有一个线程） 来保证初始化的时候只有一个线程
//  能实现懒加载 和 线程安全
class Singleton{
   // 1 g构造器私有
    private Singleton(){}
    // 2 使用静态内部类的形式进行单例模式 创建一个静态内部类 类中的属性是Singleton对象
    //  静态内部类的特点 静态内部类不会随着外部类的装载而立即装载
    //   静态内部类 在装载的时候只会装再一次 且 线程是安全的。
    private static class Single{
        private static final Singleton singleton = new Singleton();
    }
    // 3 同样是提供一个共有的静态方法进行返回
    public static Singleton getInstance(){
        return Single.singleton;
    }
}
