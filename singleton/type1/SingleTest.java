package cn.edu.designpattern.singleton.type1;

public class SingleTest {
    public static void main(String[] args) {
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance);


    }
}
// 饿汉式 （静态变量）
// 优缺点：优点：就是简单 在类加载的时候进行了实例化  没有线程同步的问题。
// 缺点：没有实现懒加载的问题， 如果不使用对象就会造成内存的浪费
class Singleton{
    //1 首先将构造器私有化 外部就不能 new
    private Singleton(){

    }
    //2 在本类的内部来创建对象 在类的加载的 时候对象就会创建
    private final static Singleton SINGLETON = new Singleton();
    //3 使用一个共有的静态方法来获取对象
    public static Singleton getInstance(){
        return SINGLETON;
    }
}
class Singleton2{
    // 使用的是静态代码块
    // 优缺点和上面的静态变量一致
    //1 首先将构造器私有化 外部就不能 new
    private Singleton2(){

    }
    //2 在本类的内部来创建对象 在类的加载的 时候对象就会创建 但是使用的是静态代码块实现赋值
    private final static Singleton2 SINGLETON_2;
    static{
        SINGLETON_2 = new Singleton2();
    }
    //3 使用一个共有的静态方法来获取对象
    public static Singleton2 getInstance(){
        return SINGLETON_2;
    }
}
