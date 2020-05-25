package cn.edu.designpattern.principle.liskov.improve;

public class LiskovImprove {
    /**
     * 里氏替换原则引用基类的地方必须能透明的使用齐子类对象（子类中尽量的不要重写父类中的方法）
     * 解决方式就是使用一个base类 通用的方式来将父类和子类都继承一个更加基础的类，将原有的继承关系去掉 而是使用聚合 组合  依赖的关系
     */
    public static void main(String[] args) {

    }
}
// 创建一个base类
class Base {

}
// 创建了一个A类
class A extends Base {
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

// 使用b类来继承A类
class B extends Base {
    private A a = new A();
    //  无意中重写了A类中的方法
    public int func1(int num1, int num2){
        return num1 + num2;

    }
    // 但是想使用A类中的方法 使用的是组合的方式
    public int func3(int a, int b){
        return this.a.func1(a, b);
    }
    public int func2(int a, int b){
        return func1(a, b) + 9;
    }
}