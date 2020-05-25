package cn.edu.designpattern.singleton.type2;

public class SingleTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
    }

}
// 使用懒汉式的方式来实现单例模式 缺点是线程不安全

// 优缺点：优点： 实现懒加载 缺点 线程不安全 不能使用这样的方式
class Singleton{
    // 首先是将构造器私有化
    private Singleton(){

    }
    //
    private static Singleton singleton;
    // 提供一个静态方法 只有使用该方法时，才会创建instance实例化对象
    public static Singleton getInstance(){
        if (singleton == null){
            // 在多个线程进入判断的时候 没有来得及创建对象 另一个线程也就进来创建对象就会创建多个实例
            singleton = new Singleton();
        }
        // 就是第一次进行加载 对象为空就进行创建  之后对象就不为空 直接返回
        return singleton;
    }
}
// 对上面的方式进行的改进 优缺点： 这种方式不推荐使用
// 优点：就是能解决线程不安全的问题  缺点：效率低多个线程实例化都需要同步 是效率变低
class Singleton2{
    // 首先是将构造器私有化
    private Singleton2(){

    }
    //
    private static Singleton2 singleton;
    // 提供一个静态方法 只有使用该方法时，才会创建instance实例化对象 使用线程同步的方式将方法锁住
    public static synchronized Singleton2 getInstance(){// 注意的是将线程同步放到同步代码块中 不能锁住
        if (singleton == null){
            // 在多个线程进入判断的时候 没有来得及创建对象 另一个线程也就进来创建对象就会创建多个实例
            singleton = new Singleton2();
        }
        // 就是第一次进行加载 对象为空就进行创建  之后对象就不为空 直接返回
        return singleton;
    }
}
