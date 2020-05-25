package cn.edu.designpattern.proxy.staticproxy;

/**
 * @Author: DDG
 * @Date: 2020/5/4 11:15
 * @Description:
 */
public class TeacherStaticProxy implements ITeacherDao{

    private ITeacherDao teacherDao;

    public TeacherStaticProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public static TeacherStaticProxy getInstance(ITeacherDao teacherDao){
        return new TeacherStaticProxy(teacherDao);
    }

    @Override
    public void teach() {
        System.out.println("teacher ma  start up ");
        teacherDao.teach();
        System.out.println("teacher ma shang dang le");
    }
}
