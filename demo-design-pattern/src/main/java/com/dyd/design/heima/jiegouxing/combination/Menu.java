package com.dyd.design.heima.jiegouxing.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.combination.jiegouxing.heima.design.Menu
 * @date ：Created in 2024/1/19 18:07
 * @description：
 * @modified By：
 * @version:
 */
public class Menu extends MenuComponent{

    private List<MenuComponent> list = new ArrayList<MenuComponent>();

    public Menu(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return list.get(index);
    }

    @Override
    public void print() {
        //打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
        //打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : list) {
            menuComponent.print();
        }
    }
}
