package cn.edu.designpattern.prototype;

public class Sheep implements Cloneable {

    private String name;
    private int age;
    private String color;
    private Sheep friend;

    public Sheep() {
    }

    public Sheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Sheep clone()  {
        // 这里使用的是浅拷贝 的方式进行clone
        // 使用浅拷贝 默认的就是 基本数据类型 和 字符串就是将值复制一份 但是对于引用类型就是将对象的引用复制一份 但是指向的是同一个对象
        // String类型的特殊性：String类型的不可变问题 是一个常量 导致会clone出一个新的对象
        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
       Sheep sheep = new Sheep("1", 22, "heise", new Sheep());
        Sheep sheep1 = sheep.getClass().newInstance();
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep == sheep1);


    }
}
