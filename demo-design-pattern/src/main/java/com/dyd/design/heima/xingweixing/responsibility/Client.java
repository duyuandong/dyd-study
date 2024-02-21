package com.dyd.design.heima.xingweixing.responsibility;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.xingweixing.chain_of_responsibility.Client
 * @date ：Created in 2024/1/22 15:55
 * @description：责任链模式  领导请假流程  列如javaWeb中Filterchain中的Filter
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小米","身体不适",1);
        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager general = new GeneralManager();
        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(general);
        //小明提交请假申请
        groupLeader.submit(leave);
    }
}
