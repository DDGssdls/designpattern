package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 16:42
 * @Description:
 */
public class DvdPlayer {

    private static DvdPlayer dvdPlayer = new DvdPlayer();

    private DvdPlayer(){}

    public static DvdPlayer getInstance(){
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD on");
    }

    public void off(){
        System.out.println("DVD off");

    }
    public void play(){
        System.out.println("DvD play");
    }

}
