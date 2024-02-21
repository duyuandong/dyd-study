package com.dyd.design.heima.xingweixing.iterator;

import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.iterator.xingweixing.heima.design.StudentIteratorImpl
 * @date ：Created in 2024/1/24 15:56
 * @description：具体迭代器角色类
 * @modified By：
 * @version:
 */
public class StudentIteratorImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0; //用来记录遍历位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student student = list.get(position);
        position++;
        return student;
    }
}
