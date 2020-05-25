package cn.edu.designpattern.principle.openandclose;

public class OpenAndClose {
    // 开闭原则 P16 是编程中最基础的 最重要的一种设计原则。
    //  一个软件实体的类，函数和模块要对扩展开放（提供方），对修改关闭（对使用方）有抽象来构建框架，用实现扩展细节。
    //  （使用其他的原则和设计模式就是为了）遵循开闭原则。 尽量实现通过扩展而不是修改来实现变化。（是核心）就像是依赖倒转原则
    // 使用抽象类是为了扩展 使用接口是为了满足规范
    public static void main(String[] args) {

    }
}
//这是一个用于绘图的类：
class GraphicEditor {
    //接收Shape对象，调用draw方法
    public void drawShape(Shape s) {
        s.draw();
    }
}

//Shape类，基类
abstract class Shape {
    int m_type;

    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制三角形 ");
    }
}

//新增一个图形
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制其它图形 ");
    }
}