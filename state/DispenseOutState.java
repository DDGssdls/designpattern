package cn.edu.designpattern.state;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:54
 * @Description:
 */
public class DispenseOutState extends State {

    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("下次参加");
        System.exit(0);
    }

    @Override
    public boolean raffle() {
        System.out.println("下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("下次参加");
    }
}
