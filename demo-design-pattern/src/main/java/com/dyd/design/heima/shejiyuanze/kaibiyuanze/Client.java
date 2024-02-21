package com.dyd.design.heima.shejiyuanze.kaibiyuanze;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.design.openclose.Client
 * @date ：Created in 2024/1/11 17:00
 * @description：测试类
 * @modified By：
 * @version:
 */
public class Client {
    public static void main(String[] args) {

        // 定义sougo输入
        SougoInput sougoInput = new SougoInput();
        // 定义一个皮肤
        AbstractSkin skin = new KingSkin();
        // 给输入设置皮肤
        sougoInput.setSkin(skin);
        // 调用输入的显示方法
        sougoInput.display();
    }
}
