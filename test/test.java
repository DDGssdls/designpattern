package cn.edu.designpattern.test;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
       //   Runtime 就是单利模式的使用 使用的是饿汉式
        /*Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();
        Singleton singleton5 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);
        System.out.println(singleton5);*/

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            new Thread(() ->{
                Singleton instance = Singleton.getInstance();
                //Singleton2 instance1 = Singleton2.getInstance();
                //Singleton3 instance2 = Singleton3.getInstance();
                System.out.println("Thread " +finalI+ instance);
                //System.out.println("Thread " +finalI+ instance1);
                //System.out.println("Thread " +finalI+ instance2);
            }, String.valueOf(i)).start();
            System.out.println();
        }

    }
}

class Singleton{

    private Singleton(){

    }

    private static volatile Singleton singleton;

    public static Singleton getInstance(){
        if (singleton == null){

            synchronized (Singleton.class){
                if (singleton == null){
                    try {
                        TimeUnit.MILLISECONDS.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
class Singleton2{
    private Singleton2(){

    }
    private static class SingletonInstance{

        private static final  Singleton2 SINGLETON_2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SingletonInstance.SINGLETON_2;
    }

}
enum  Singleton3{
    SINGLETON_3;
    public static Singleton3 getInstance(){
        return SINGLETON_3;
    }
}

