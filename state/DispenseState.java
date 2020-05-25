package cn.edu.designpattern.state;

import java.util.Random;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:54
 * @Description:
 */
public class DispenseState extends State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分 不能重复扣除");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能发放积分");
        return false;
    }

    @Override
    public void dispensePrize() {
       if (activity.getCount() > 0){
           System.out.println("进行奖品的发放 发放中！");
           activity.setState(activity.getDispenseOutState());
       }else{
           System.out.println("奖品发放完成了");
           activity.setState(activity.getDispenseState());
       }
    }
}
