package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 16:50
 * @Description:
 */
public class Projector {

    private Projector(){}

    private static volatile Projector instance;

    public static Projector getInstance(){
        if (instance == null){
            synchronized (Projector.class){
                if (instance == null){
                    instance = new Projector();
                }
            }
        }
        return instance;
    }
    public void on(){
        System.out.println("projector on");
    }

    public void off(){
        System.out.println("projector off");
    }

    public void focus(){
        System.out.println("projector play");
    }
}
