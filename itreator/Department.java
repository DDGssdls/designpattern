package cn.edu.designpattern.itreator;

/**
 * @Author: DDG
 * @Date: 2020/5/6 11:26
 * @Description:
 */
public class Department {

    private String desc;

    private String name;

    public Department(String desc, String name) {
        this.desc = desc;
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "desc='" + desc + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
