package cn.edu.designpattern.state;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:31
 * @Description: 状态模式： 就是对象在多种状态转换时，需要对外输出不同的行为的问题的解决
 */
public class Client {
    public static void main(String[] args) {

        RaffleActivity raffleActivity = new RaffleActivity(1);

        for (int i = 0; i < 30; i++) {
            System.out.println("-----------------");
            raffleActivity.deductMoney();
            raffleActivity.raffle();
        }
    }
}
