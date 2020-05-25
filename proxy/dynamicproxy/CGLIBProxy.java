package cn.edu.designpattern.proxy.dynamicproxy;

import cn.edu.designpattern.proxy.staticproxy.TeacherDao;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: DDG
 * @Date: 2020/5/4 12:18
 * @Description:
 */
public class CGLIBProxy  {
    public static void main(String[] args) {
        TeacherDao proxy = proxy(new TeacherDao());
        proxy.test();
    }

    public static TeacherDao proxy(TeacherDao teacherDao){
        Object teacher = Enhancer.create(teacherDao.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object invoke = null;
                System.out.println("teacher ma  qi fei le  ");
                if("teach".equals(method.getName())){
                    invoke = method.invoke(teacherDao, objects);
                }
                //invoke = method.invoke(teacherDao, objects);
                System.out.println("wuhu wuhu wuhu wuhu wuhu wuhu");
                System.out.println("teacher ma shang dang le ");
                return invoke;
            }
        });
        return (TeacherDao) teacher;
    }


}
