package cn.edu.designpattern.conposite;

public abstract class OrganizationComponent {

    private String name;

    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    protected void add(OrganizationComponent organizationComponent){
        // 使用默认的实现 防止叶子节点进行操作
        throw  new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent organizationComponent){
        // 使用默认的实现 防止叶子节点进行操作
        throw  new UnsupportedOperationException();
    }
    // 所有的子类都需要实现 打印的方法
    protected  abstract void print();
}
