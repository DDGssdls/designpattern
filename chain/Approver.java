package cn.edu.designpattern.chain;

/**
 * @Author: DDG
 * @Date: 2020/5/9 15:26
 * @Description:
 */
public abstract class Approver {

    private Approver approver; //下一个处理者
    private String name; // 当前处理者的名称

    public Approver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    // 处理审批请求的方法
    abstract void processRequest(Request request);

}
