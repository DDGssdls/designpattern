package cn.edu.designpattern.state;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:50
 * @Description:
 */
public abstract class State {

    // 扣除积分
    public abstract void deductMoney();
    // 是否是抽中奖品
    public abstract boolean raffle();
    // 发放奖品
    public  abstract void dispensePrize();
}
