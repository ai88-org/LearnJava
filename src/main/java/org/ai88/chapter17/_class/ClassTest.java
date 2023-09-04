package org.ai88.chapter17._class;

import org.junit.Test;

/**
 * 获取class实例的几种方式
 */
public class ClassTest {
    @Test
    public void test1() throws Exception{
        // 运行时类的静态属性
        Class clazz1 = User.class;
        System.out.println(clazz1);

        // 通过对象
        User user = new User();
        Class clazz2 = user.getClass();
        System.out.println(clazz2);
        System.out.println(clazz1 == clazz2);

        // 比较常用的forName
        String className = "org.ai88.chapter17._class.User";
        Class clazz3 = Class.forName(className);
        System.out.println(clazz1 == clazz3);

        // 类加载器
        Class clazz4 = ClassLoader.getSystemClassLoader().loadClass("org.ai88.chapter17._class.User");
        System.out.println(clazz1 == clazz4);
    }
}
