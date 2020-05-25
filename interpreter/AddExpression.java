package cn.edu.designpattern.interpreter;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/8 11:08
 * @Description: 加法解析器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }
    // 真的加法处理器
    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return left.interpreter(map) + right.interpreter(map);
    }
}
