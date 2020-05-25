package cn.edu.designpattern.proxy.staticproxy;

/**
 * @Author: DDG
 * @Date: 2020/5/4 11:15
 * @Description:
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teacher ma teach");
    }
    public void test(){
        System.out.println("teacher ma kaishile ");
    }
}
