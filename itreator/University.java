package cn.edu.designpattern.itreator;


import java.util.LinkedList;

/**
 * @Author: DDG
 * @Date: 2020/5/6 11:00
 * @Description:
 */
public class University {

    private LinkedList<Department> departments;

    private int position = 0;

    private int lastReturn = -1;
    private int size;

    public University(LinkedList<Department> departments) {
        this.departments = departments;
        this.size = departments.size();
    }

    public Iterator iterator() {
        return new ConcreteIterator();
    }

    public LinkedList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(LinkedList<Department> departments) {
        this.departments = departments;
    }

    class ConcreteIterator implements Iterator<Department> {


        @Override
        public boolean hasNext() {
            lastReturn++;

            return position < size;
        }

        @Override
        public Department next() {

            return departments.get(position ++) ;
        }

        @Override
        public void remove() {
              // departments.remove(lastReturn );
        }
    }
}
