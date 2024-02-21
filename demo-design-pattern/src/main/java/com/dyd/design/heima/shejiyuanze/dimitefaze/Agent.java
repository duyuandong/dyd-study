package com.dyd.design.heima.shejiyuanze.dimitefaze;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.heima.dimitefaze.before.Agent
 * @date ：Created in 2024/1/15 16:32
 * @description：
 * @modified By：
 * @version:
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting(){
        System.out.println(fans.getName() + "与明星" + star.getName() + "见面了.");
    }

    public void business(){
        System.out.println(company.getName() + "与明星" + star.getName() + "合作了.");
    }
}
