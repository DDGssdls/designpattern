package cn.edu.designpattern.state;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:54
 * @Description:
 */
public class NoRaffleState extends State {

    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除积分50 可以开始抽奖了");
        // 扣除积分之后将状态修改成可抽奖状态
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣除积分才开始抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能进行奖品的发送");
    }
}
