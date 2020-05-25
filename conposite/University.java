package cn.edu.designpattern.conposite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent {

    public University(String name, String desc) {
        super(name, desc);
    }

    List<OrganizationComponent> list =  new ArrayList<OrganizationComponent>();

    @Override
    protected void print() {
        System.out.println("-------------"+this.getName()+"---------------");
        for (OrganizationComponent organizationComponent : list) {
            organizationComponent.print();
        }
    }
    // 非叶子结点需要进行方法的实现

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        list.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        list.remove(organizationComponent);
    }

}
