package com.dyd.design.heima.xingweixing.mediator;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.com.dyd.mediator.xingweixing.heima.design.MediatorStructure
 * @date ：Created in 2024/1/24 15:19
 * @description：具体的中介者角色类
 * @modified By：
 * @version:
 */
public class MediatorStructure extends Mediator{
    //聚合房主具体的租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    void constact(String message, Person person) {

        if(person == houseOwner){//若是房主
            tenant.getMessage(message);
        }else{//若是租房者
            houseOwner.getMessage(message);
        }
    }
}
