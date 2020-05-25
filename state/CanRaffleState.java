package cn.edu.designpattern.state;

import java.util.Random;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:54
 * @Description:
 */
public class CanRaffleState extends State {

    private RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖！");
        int i = new Random().nextInt(10);
        if (i == 0){
            System.out.println("中奖了");
            activity.setState(activity.getDispenseState());
            return true;
        }
        System.out.println("没有抽中奖品！");
        activity.setState(activity.getNoRaffleState());
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖 不能进行奖品的发送");
    }
}
