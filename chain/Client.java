package cn.edu.designpattern.chain;

/**
 * @Author: DDG
 * @Date: 2020/5/9 15:10
 * @Description: 责任链模式 在springmvc 中handlerInterceptor中使用 就是责任链模式 就是
 * 象双亲委派机制一样 自己处理不了的就交给子类处理 一个类中 还有子类的一个对象进行聚合 就像是一条链表的一样
 * 但是需要注意的一点就是需要控制节点的数量 否则处理的效率比较的低 可以设置一个最大的节点数量进行节点的控制
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request(1, 5001, 1);
        Approver a = new A("A");
        a.processRequest(request);
    }
}
