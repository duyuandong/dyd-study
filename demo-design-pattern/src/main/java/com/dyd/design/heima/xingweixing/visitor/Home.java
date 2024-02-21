package com.dyd.design.heima.xingweixing.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.visitor.xingweixing.heima.design.Home
 * @date ：Created in 2024/1/24 17:25
 * @description：对象结构类
 * @modified By：
 * @version:
 */
public class Home {
    //声明一个集合对象,用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();
    //添加
    public void add(Animal animal){
        nodeList.add(animal);
    }

    public void action(Person person){
        //遍历集合,获取每一个元素,让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
