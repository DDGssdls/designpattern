package cn.edu.designpattern.chain;

/**
 * @Author: DDG
 * @Date: 2020/5/9 15:34
 * @Description:
 */
public class C extends Approver {
    public C(String name) {
        super(name);
    }

    @Override
    void processRequest(Request request) {
        if (request.getPrice() <= 20000f){
            System.out.println("请求的编号" + request.getId()+"被"+ this.getName()+"进行处理");
        }else{
            // 处理不了就是用后继者进行处理
            this.setApprover(new D("D"));

            this.getApprover().processRequest(request);
        }
    }
}
