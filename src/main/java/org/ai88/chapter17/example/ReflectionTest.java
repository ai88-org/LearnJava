package org.ai88.chapter17.example;

import org.junit.Test;

import javax.swing.plaf.PanelUI;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    /**
     * 使用反射之前可以做的操作
     */
    @Test
    public void test1(){
        // 创建Person类的对象
        Person p1 = new Person();
        System.out.println(p1);

        // 调用属性
        p1.age = 10;
        System.out.println(p1.age);

        // 调用方法
        p1.show();
    }

    /**
     * 使用反射完成上述操作
     */
    @Test
    public void test2() throws Exception{
        // 创建实例
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();
        System.out.println(p1);

        // 调用属性
        Field ageField = clazz.getField("age");
        ageField.setInt(p1,10);
        System.out.println(ageField.get(p1));

        // 调用方法
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(p1);
    }

    /**
     * 暴力反射，调用private修饰的属性和方法
     */
    @Test
    public void test3() throws Exception{
        Class clazz = Person.class;
        Constructor c1 = clazz.getDeclaredConstructor(String.class,int.class);
        c1.setAccessible(true);
        Person p1 = (Person) c1.newInstance("Tom",12);
        System.out.println(p1);

        // 调用私有属性
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p1,"张三");
//        String name = (String)nameField.get(p1);
//        System.out.println(name);
        System.out.println(nameField.get(p1));

        // 调用私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String message = (String)showNation.invoke(p1,"CHN");
        System.out.println(message);
    }
}
