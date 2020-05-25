package cn.edu.designpattern.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("z3", 22, "黑色", new Sheep());
        Sheep sheep1 = sheep.clone();

        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();



        System.out.println(sheep1.getFriend().hashCode() +"\t"+ sheep1.getName().hashCode() );
        System.out.println(sheep2.getFriend().hashCode() +"\t"+ sheep2.getName().hashCode() );
        System.out.println(sheep3.getFriend().hashCode() +"\t"+ sheep2.getName().hashCode());
        System.out.println(sheep4.getFriend().hashCode() +"\t"+ sheep2.getName().hashCode());
    }
}
