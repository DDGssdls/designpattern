package cn.edu.designpattern.interpreter;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/8 10:56
 * @Description: 抽象的表达式角色 通过HashMap 获取到各个变量的值
 */
public abstract class AbstractExpression {
    // 解释公式 和 数值：key就是 表达式 a b c 等 value 就是具体的值
    public abstract int interpreter(HashMap<String, Integer> map);
}
