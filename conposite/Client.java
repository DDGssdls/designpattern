package cn.edu.designpattern.conposite;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        // 组合模式中的 在jdk中的使用： 就是hashmap中的 putAll方法中

        University university = new University("清华大学", "niubi");
        College college = new College("1", "1");
        College college2 = new College("2", "2");
        College college3 = new College("3", "3");
        College college4 = new College("4", "4");
        university.add(college);
        university.add(college2);
        university.add(college3);
        university.add(college4);
        new HashMap();

        Department department = new Department("5", "5");
        Department department2 = new Department("6", "6");
        Department department3 = new Department("7", "7");
        Department department4 = new Department("8", "8");

        college.add(department);
        college.add(department2);
        college.add(department3);
        college.add(department4);
        college2.add(department);
        college2.add(department2);
        college2.add(department3);
        college2.add(department4);
        college3.add(department);
        college3.add(department2);
        college3.add(department3);
        college3.add(department4);
        college4.add(department);
        college4.add(department2);
        college4.add(department3);
        college4.add(department4);

        university.print();

    }
}
