package com.dyd.design.heima.jiegouxing.combination;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.combination.jiegouxing.heima.design.MenuItem
 * @date ：Created in 2024/1/19 18:12
 * @description：菜单项类 属于叶子结点
 * @modified By：
 * @version:
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        //打印菜单项的名称
        System.out.println(name);
    }
}
