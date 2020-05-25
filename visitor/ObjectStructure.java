package cn.edu.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:26
 * @Description:
 */
public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();
    // 将person添加到list中
    public void attach(Person person){
        persons.add(person);
    }
    // 将person移出到list
    public void detach(Person person){
        persons.remove(person);
    }
    // 遍历方法
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
