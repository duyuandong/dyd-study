package com.dyd.design.heima.xingweixing.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.iterator.xingweixing.heima.design.StudentAggregateImpl
 * @date ：Created in 2024/1/24 16:01
 * @description：具体聚合角色类
 * @modified By：
 * @version:
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void delStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
