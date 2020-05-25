package cn.edu.designpattern.builder;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @Author: DDG
 * @Date: 2020/4/26 11:47
 * @Description:
 */
public class House {
    private String base;
    private String wall;
    private String roofed;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}

// 抽象的建造者
abstract class HouseBuilder {
    protected House house = new House();
    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    //建造房子好， 将产品(房子) 返回
    public House buildHouse() {
        return house;
    }
}
class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //通过 setter 传入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 5 米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 1 米 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋顶 木头屋顶 ");
    }
}
class NewBeeHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println(" newBee房子打地基 500 米 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" newBee房子砌墙 100 米 ");
    }

    @Override
    public void roofed() {
        System.out.println(" newBee房子屋顶 newBee屋顶 ");
    }
}
class Client{
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //完成盖房子，返回产品(普通房子)
        House house = houseDirector.constructHouse();
        System.out.println("------------------------------");
        //盖普通房子
        NewBeeHouse newBeeHouse = new NewBeeHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector2 = new HouseDirector(newBeeHouse);
        //完成盖房子，返回产品(普通房子)
        House house2 = houseDirector2.constructHouse();
        new StringBuilder();
    }
}