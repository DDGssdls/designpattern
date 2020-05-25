package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 16:53
 * @Description:
 */
public class Screen {

    private Screen(){}

    private static Screen instance;
    static {
        instance = new Screen();
    }
    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }

    public void down(){
        System.out.println("Screen down");
    }


}
