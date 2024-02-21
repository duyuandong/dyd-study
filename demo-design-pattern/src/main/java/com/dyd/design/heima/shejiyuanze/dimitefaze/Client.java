package com.dyd.design.heima.shejiyuanze.dimitefaze;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.dimitefaze.before.AgentDemo
 * @date ：Created in 2024/1/15 16:37
 * @description：
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {
        Star star = new Star("李晓明");
        Fans fans = new Fans("小红");
        Agent agent = new Agent();
        agent.setFans(fans);
        agent.setStar(star);
        agent.meeting();

        Company company = new Company("腾讯");
        agent.setCompany(company);
        agent.business();

    }
}
