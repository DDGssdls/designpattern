package cn.edu.designpattern.itreator;



/**
 * @Author: DDG
 * @Date: 2020/5/6 11:00
 * @Description:
 */
public class Collage {

    private Department[] departments;

    private int position = 0;// 遍历 下一个return的

    //private int lastReturn = -1; // 返回 last return 的

    public Collage(Department[] departments) {
        this.departments = departments;
    }

    public Iterator iterator(){
        return new ConcreteIterator();
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    class ConcreteIterator implements Iterator<Department> {
        @Override
        public boolean hasNext() {
            return position < departments.length;
        }

        @Override
        public Department next() {
            //lastReturn ++;
            return departments[position ++];
        }

        @Override
        public void remove() {
            if (position < departments.length){
                departments[position] = null;
            }
        }
    }
}
