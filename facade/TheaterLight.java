package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 16:59
 * @Description:
 */
public class TheaterLight {
    private static TheaterLight theaterLight ;

    private TheaterLight(){}

    public static TheaterLight getInstance(){
        synchronized (TheaterLight.class){
            if (theaterLight == null){
                theaterLight = new TheaterLight();
            }
        }
        return theaterLight;
    }
    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");

    }
}
