package com.dyd.design.heima.xingweixing.memento.whitebox;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.whitebox.memento.xingweixing.heima.design.Client
 * @date ：Created in 2024/1/24 18:21
 * @description：备忘录模式  列子;游戏打boss
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("---------------大战boss前--------------------");
        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();//初始化状态操作
        gameRole.saveState();
        gameRole.stateDisplay();

        //将改游戏角色内部状态进行备份
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("---------------大战boss后--------------------");

        //损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("---------------恢复之前状态--------------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
