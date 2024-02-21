package com.dyd.design.heima.xingweixing.responsibility;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.xingweixing.chain_of_responsibility.LeaveRequest
 * @date ：Created in 2024/1/22 15:56
 * @description：客户类角色 (请假)
 * @modified By：
 * @version:
 */
public class LeaveRequest {
    private String name;
    private String content;
    private int num;

    public LeaveRequest(String name, String content, int num) {
        this.name = name;
        this.content = content;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getNum() {
        return num;
    }
}
