package cn.edu.designpattern.flyweight;

/**
 * @Author: DDG
 * @Date: 2020/5/4 10:40
 * @Description:
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
