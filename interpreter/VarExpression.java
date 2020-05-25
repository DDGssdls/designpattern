package cn.edu.designpattern.interpreter;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/8 11:07
 * @Description: 变量的解析器 通过变量的名称 获取到变量的具体的值
 */
public class VarExpression extends AbstractExpression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> map) {
        return map.get(key);
    }
}
