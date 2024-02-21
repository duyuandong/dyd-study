package com.dyd.sql;

import net.sf.jsqlparser.JSQLParserException;

import java.util.HashMap;

/**
 * @author ：duyd@segimail.com
 * @class ：com.spring.demo.sql.TestSql
 * @date ：Created in 2024/2/19 17:57
 * @description：
 * @modified By：
 * @version:
 */
public class TestSql {
    public static void main(String[] args) throws JSQLParserException {
        // 使用工具类把SQL转换为Select对象
        /*Select select = (Select) CCJSqlParserUtil.parse("SELECT username,age,sex FROM user");
        SelectBody selectBody = select.getSelectBody();
        PlainSelect p = (PlainSelect)selectBody;
        System.err.println(p.getSelectItems());*/
        HashMap<String, Object> map = new HashMap<>();
        map.put("name","xxx");
        map.put("key","sii");
        System.out.println(map.keySet().toArray(new String[0]));
    }
}
