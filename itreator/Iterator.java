package cn.edu.designpattern.itreator;

public interface Iterator<E> {

    boolean hasNext();
    E next();
    void remove();
}
