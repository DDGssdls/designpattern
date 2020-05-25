package cn.edu.designpattern.observer;


/**
 * @Author: DDG
 * @Date: 2020/5/7 11:31
 * @Description:
 */
public class CurrentConditions implements Observer {

    private int obsNum;

    public CurrentConditions(int obsNum) {
        this.obsNum = obsNum;
    }
    // 要是需要进行对象的比较的时候 就是需要重写equals方法就行 但是不用重写hashcode方法 不是hash结构
    /*@Override
    public boolean equals(Object obj) {
        CurrentConditions conditions = null;
        if (obj instanceof CurrentConditions){
            conditions = (CurrentConditions)obj;
            return this.obsNum == conditions.obsNum;
        }else{
            throw new  ClassCastException("参数类型不对");
        }
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentConditions that = (CurrentConditions) o;
        return obsNum == that.obsNum;
    }

    @Override
    public void update(Weather weather) {
        System.out.println("当前Observer的编号是 " + obsNum + " 当前的天气状况是 " + weather);
    }
}
