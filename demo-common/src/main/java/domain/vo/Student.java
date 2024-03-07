package domain.vo;

import annotations.MyAnno;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：duyd@segimail.com
 * @class ：domain.vo.Student
 * @date ：Created in 2024/3/6 17:30
 * @description：
 * @modified By：
 * @version:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer num;
    private String name;
    private Integer sex;
    private Integer age;

    private void print(){
        System.out.println("姓名: " + this.name + "\n性别: " + (this.sex == 1 ? '男' : '女') + "\n年龄: " + this.age + "\n学号: " + this.num);
    }
}
