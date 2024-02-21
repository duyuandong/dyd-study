package com.dyd.design.heima.shejiyuanze.yilaidaozhuan.after;

public class XiJieHardDisk implements HardDisk {

    //保存数据
    public void save(String data){
        System.out.println("使用xijie存储:"+data);
    };
    //获取数据
    public String get(){
        return "数据";
    };
}
