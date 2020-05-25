package cn.edu.designpattern.state;

import cn.edu.designpattern.interpreter.VarExpression;

/**
 * @Author: DDG
 * @Date: 2020/5/9 11:54
 * @Description:
 */
public class RaffleActivity {

    private int count;

    private State state;

    private State stateCan = new CanRaffleState(this);
    private State stateNo = new NoRaffleState(this);
    private State stateDis = new DispenseState(this);
    private State stateDisOut = new DispenseOutState(this);


    public RaffleActivity(int count) {
        this.state = stateNo;
        this.count = count;
    }


    public int getCount() {
        return count --;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setState(State state) {
        this.state =state;
    }

    public State getCanRaffleState() {
        return stateCan;
    }

    public State getDispenseState() {
        return stateDis;
    }

    public State getNoRaffleState() {
        return stateNo;
    }

    public State getDispenseOutState() {
        return stateDisOut;
    }

    public void deductMoney() {
        state.deductMoney();
    }


    public void raffle() {
         if(state.raffle())
             state.dispensePrize();
    }


    public void dispensePrize() {
        state.dispensePrize();
    }
}
