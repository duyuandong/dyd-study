package domain.vo;

import annotations.MyAnno;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：duyd@segimail.com
 * @class ：domain.vo.IClass
 * @date ：Created in 2024/3/6 18:27
 * @description：
 * @modified By：
 * @version:
 */
@Data
@ToString
public class IClass {
    List<Student> list;

    public IClass() {
        list = new ArrayList<>();
    }

    @MyAnno(name = "jack" ,bean = IClass.class)
    public void addStudent(Student stu){
        list.add(stu);
    }

    public void delStudent(Student stu){
        list.remove(stu);
    }
    public void getStudents(){
        list.forEach(i -> System.out.println(i));
    }
}
