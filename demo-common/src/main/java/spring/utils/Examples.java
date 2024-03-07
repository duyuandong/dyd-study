package spring.utils;

import annotations.MyAnno;
import com.sun.istack.internal.Nullable;
import domain.vo.IClass;
import domain.vo.Student;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.cglib.beans.ImmutableBean;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StopWatch;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：duyd@segimail.com
 * @class ：spring.utils.Reflect
 * @date ：Created in 2024/3/6 17:19
 * @description：spring反射工具类
 * @modified By：
 * @version:
 */
public class Examples {
    public static void main(String[] args) {
        //reflectExample();
        //cglibExample();
        unixExample();
    }

    @Nullable
    private static void reflectExample(){
        Method print = ReflectionUtils.findMethod(Student.class, "print");
        System.out.println(print);
        ReflectionUtils.makeAccessible(print);
        Student stu = new Student(1001, "小明", 1, 18);
        try {
            print.invoke(stu);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        Field num = ReflectionUtils.findField(Student.class, "num");
        ReflectionUtils.makeAccessible(num);
        System.out.println(num);

        Method addStudent = ReflectionUtils.findMethod(IClass.class, "addStudent",Student.class);
        //注解反射
        MyAnno annotation = AnnotationUtils.findAnnotation(addStudent, MyAnno.class);
        System.out.println(annotation.bean());
        IClass iClass = null;
        try {
            iClass = IClass.class.newInstance();

            addStudent.invoke(iClass,stu);
        }catch (Exception ex){

        }
        System.out.println(iClass);
//        Method[] methods = IClass.class.getMethods();
//        for (Method method : methods) {
//            if(method.isAnnotationPresent(MyAnno.class)){
//                System.out.println("myAnno");
//            }
//
//        }
    }

    private static void cglibExample(){
        //对象复制
        BeanCopier beanCopier = BeanCopier.create(Student.class, Student.class, false);
        Student student = new Student(10002, "黄依依", 2, 18);
        Student student2 = new Student();
        beanCopier.copy(student,student2,null);
        System.out.println(student2);

        //对象转map
        Map<String,Object> map = new HashMap<>();
        map.putAll(BeanMap.create(student2));
        Map<String,Object> beanMap = BeanMap.create(student2);
        System.out.println(map);
        System.out.println(beanMap);

        //map转对象
        Student student1 = new Student();
        BeanMap.create(student1).putAll(map);
        System.out.println(student1);

        //创建不可变bean
        Student student3 = new Student(20001,"晒晒",1,12);
        Student stu = (Student)ImmutableBean.create(student3);
        stu.setAge(11);
    }

    //时间戳
    private static void unixExample(){
        //记录时间戳
        StopWatch startTest = new StopWatch("startTest");
        startTest.start("step 1");
        for (int i = 0; i < 1000; i++) {
            Student student = new Student();
        }
        startTest.stop();
        startTest.start("step 2");
        startTest.stop();
        System.out.println(startTest.prettyPrint());
    }
}
