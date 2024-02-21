package com.dyd.design.heima.xingweixing.iterator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.iterator.xingweixing.heima.design.StudentIterator
 * @date ：Created in 2024/1/24 15:55
 * @description：抽象迭代器角色接口
 * @modified By：
 * @version:
 */
public interface StudentIterator {
    //判断是否还有元素
    boolean hasNext();
    //获取下一个元素
    Student next();
}
