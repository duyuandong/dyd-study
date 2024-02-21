package com.dyd.design.heima.xingweixing.responsibility;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.xingweixing.chain_of_responsibility.GroupLeader
 * @date ：Created in 2024/1/22 16:03
 * @description：组领导 具体处理者角色
 * @modified By：
 * @version:
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(0, NUM_ONE);
    }

    @Override
    public void handlerLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天,原因: " + leave.getContent());
        System.out.println("小组长审批同意!");
    }
}
