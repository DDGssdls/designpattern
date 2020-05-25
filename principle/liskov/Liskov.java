package cn.edu.designpattern.principle.liskov;

public class Liskov {
    /**
     * 里氏替换原则引用基类的地方必须能透明的使用齐子类对象（子类中尽量的不要重写父类中的方法）
     */
    public static void main(String[] args) {

    }
}
// 创建了一个A类
class A {
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}
// 使用b类来继承A类
class B extends A {
    //  无意中重写了A类中的方法
    public int func1(int num1, int num2){
        return num1 + num2;

    }
    public int func2(int a, int b){
        return func1(a, b) + 9;
    }
}