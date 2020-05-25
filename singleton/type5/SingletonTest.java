package cn.edu.designpattern.singleton.type5;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.Instance;
        Singleton singleton2 = Singleton.Instance;
        System.out.println(singleton == singleton2);


    }
}

// 单利模式的第五种实现方式 使用的是枚举的形式
// 不仅能避免多线程的问题 也能防止反序列化重新创建对象 （推荐使用 但是需要jdk1.5之后）
enum Singleton{
    Instance;
    public void sayOk(){
        System.out.println("ok");
    }
}
