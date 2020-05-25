package cn.edu.designpattern.interpreter;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/8 11:08
 * @Description:
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return left.interpreter(map) - right.interpreter(map);
    }

}
