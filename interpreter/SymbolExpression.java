package cn.edu.designpattern.interpreter;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/8 11:07
 * @Description: 运算符号的解析器： 每一个运算符号就是和前面的 和 后面的一个数字有关系
 * 是一个AbstractExpression形式 但是真正的进行解析的是其子类
 */
public abstract class SymbolExpression extends AbstractExpression {

    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public abstract int interpreter(HashMap<String, Integer> map);
}
