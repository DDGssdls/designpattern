package cn.edu.designpattern.facade;

/**
 * @Author: DDG
 * @Date: 2020/5/3 17:13
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 外观模式也就是门面模式 简单的说就是 需要使用一系列的复杂的子系统的时候 使用一个简单的门面 比较的方便
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        System.out.println("-----------");
        homeTheaterFacade.play();
        System.out.println("-----------");
        homeTheaterFacade.parse();
        System.out.println("-----------");
        homeTheaterFacade.end();
    }
}
