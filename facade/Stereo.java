package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 16:55
 * @Description:
 */
public class Stereo {

    private Stereo(){}

    private static Stereo instance;

    public static synchronized Stereo getInstance(){
        if (instance == null){
            instance = new Stereo();
        }
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");

    }
    public void up(){
        System.out.println("Stereo up");
    }

    public void down(){
        System.out.println("Stereo down");
    }
}
