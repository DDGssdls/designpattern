package cn.edu.designpattern.proxy.dynamicproxy;

import cn.edu.designpattern.proxy.staticproxy.ITeacherDao;
import cn.edu.designpattern.proxy.staticproxy.TeacherDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: DDG
 * @Date: 2020/5/4 11:32
 * @Description:
 */
public class JDKProxy {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxy = (ITeacherDao) proxy(teacherDao);
        proxy.teach();
        System.out.println("--------------------");
        ITeacherDao proxy1 = proxy();
        proxy1.teach();
    }
    public static ITeacherDao proxy(){
        // 需要注意的一点就是 强转只能是强转成接口的类型 不能是 实现类的类型
        ITeacherDao teacherDao = new TeacherDao();
        ITeacherDao teacherDao1 = (ITeacherDao) Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(), new InvocationHandler() {


            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = null;
                if ("teach".equals(method.getName())) {
                    System.out.println("teacher ma qi fei le");
                    invoke = method.invoke(teacherDao, args);
                    System.out.println(" teacher ma  shang dang le ");
                }
                return invoke;
            }
        });
        return teacherDao1;

    }
    public static Object proxy(ITeacherDao teacherDao){
        Object teacher = Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = null;
                if ("teach".equals(method.getName())) {
                    System.out.println("teacher ma qi fei le");
                    invoke = method.invoke(teacherDao, args);
                    System.out.println(" teacher ma  shang dang le ");
                }
                return invoke;
            }
        });
        return teacher;
    }
}
