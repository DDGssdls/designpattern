package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 16:46
 * @Description:
 */
public class Popcorn {

    private Popcorn(){}

    private static class Inner{
        public static final Popcorn INSTANCE = new Popcorn();
    }
    public static Popcorn getInstance(){
        return Inner.INSTANCE;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void play(){
        System.out.println("popcorn play");
    }
}
