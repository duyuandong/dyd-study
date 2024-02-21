package com.dyd.design.heima.xingweixing.iterator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.iterator.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/24 15:48
 * @description：迭代器模式
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建聚合对象
        StudentAggregateImpl sai = new StudentAggregateImpl();
        //添加元素
        sai.addStudent(new Student("张三","001"));
        sai.addStudent(new Student("李四","002"));
        sai.addStudent(new Student("王五","003"));
        sai.addStudent(new Student("赵六","004"));

        //遍历聚合对象

        //1.获取迭代器对象
        StudentIterator studentIterator = sai.getStudentIterator();
        //2.遍历
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println(student);
        }
    }
}
