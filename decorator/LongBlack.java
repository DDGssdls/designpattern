package cn.edu.designpattern.decorator;

public class LongBlack extends Coffee {

    public LongBlack(){
        setPrice(5.0f);
        setDes("美式咖啡"+ getPrice());

    }
}
