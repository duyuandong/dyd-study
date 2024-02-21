package com.dyd.design.heima.xingweixing.iterator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.iterator.xingweixing.heima.design.StudentAggregate
 * @date ：Created in 2024/1/24 16:00
 * @description：抽象聚合角色类
 * @modified By：
 * @version:
 */
public interface StudentAggregate {
    //添加学生
    void addStudent(Student student);
    //删除学生
    void delStudent(Student student);

    //获取迭代器
    StudentIterator getStudentIterator();
}
