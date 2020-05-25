package cn.edu.designpattern.proxy;

import cn.edu.designpattern.proxy.staticproxy.TeacherDao;
import cn.edu.designpattern.proxy.staticproxy.TeacherStaticProxy;

/**
 * @Author: DDG
 * @Date: 2020/5/4 11:10
 * @Description:
 */
public class Client {

    public static void main(String[] args) {
        //TeacherStaticProxy teacherStaticProxy = new TeacherStaticProxy(new TeacherDao());
        TeacherStaticProxy teacherStaticProxy = TeacherStaticProxy.getInstance(new TeacherDao());
        teacherStaticProxy.teach();
    }
}
