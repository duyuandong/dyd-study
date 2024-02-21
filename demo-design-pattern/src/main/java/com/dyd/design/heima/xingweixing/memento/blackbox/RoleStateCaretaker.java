package com.dyd.design.heima.xingweixing.memento.blackbox;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.whitebox.memento.xingweixing.heima.design.RoleStateCaretaker
 * @date ：Created in 2024/1/25 11:09
 * @description：备忘录对象管理角色
 * @modified By：
 * @version:
 */
public class RoleStateCaretaker {
    //声明RoleStateMemento 类型的变量
    private Memento memento;

    public RoleStateCaretaker() {
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}
