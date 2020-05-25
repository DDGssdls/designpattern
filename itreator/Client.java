package cn.edu.designpattern.itreator;

import java.util.LinkedList;

/**
 * @Author: DDG
 * @Date: 2020/5/6 10:54
 * @Description: 迭代器模式： 就是一个 结构中 使用的数据结构 不同 比如 有链表 数组 或者是 List Map等 一些方式
 * 但是在遍历的时候 方式不能统一 同样的在进行遍历的时候回暴露出内部的结构  所以使用一个统一的方式进行遍历就是迭代器模式
 */
public class Client {

    private static final int LENGTH = 10;

    public static void main(String[] args) {
        Department[] departments = new Department[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            departments[i] = new Department(Integer.toString(i), Integer.toString(i));
        }
        Collage collage = new Collage(departments);
        Iterator iterator = collage.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            if (count % 2 == 1) {
                iterator.remove();
            }
            System.out.println(iterator.next());
            count++;
        }

        System.out.println("-------------");
        LinkedList<Department> departments1 = new LinkedList<>();
        for (int i = 0; i < LENGTH; i++) {
            departments1.add(new Department(String.valueOf(i), String.valueOf(i)));
        }

        University university = new University(departments1);
        Iterator iterator1 = university.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
