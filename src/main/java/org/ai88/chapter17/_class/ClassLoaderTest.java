package org.ai88.chapter17._class;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/5 9:51
 */
public class ClassLoaderTest {
    @Test
    public void test1() throws Exception{
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取扩展类加载器
        ClassLoader extClassLoader= systemClassLoader.getParent();
        System.out.println(extClassLoader); // sun.misc.Launcher$ExtClassLoader@372f7a8d

        //获取引导类加载器:失败
        ClassLoader bootClassLoader= extClassLoader.getParent();
        System.out.println(bootClassLoader);
    }

    @Test
    public void test2() throws Exception{
        //用户自定义的类使用的是系统类加载器加载的。
        Class clazz = User.class;
        ClassLoader c1 = clazz.getClassLoader();
        System.out.println(c1); // sun.misc.Launcher$AppClassLoader@18b4aac2

        //对于Java的核心api使用引导类加载器加载
        Class aClass = Class.forName("java.lang.String");
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);//null
    }

    //Properties:处理属性文件
    @Test
    public void test3() throws IOException{
        Properties p = new Properties();
        FileInputStream fs = new FileInputStream("info.properties");

        p.load(fs);
        System.out.println(p.getProperty("name") + p.getProperty("password"));
    }

    //通过ClassLoader加载指定的配置文件
    //配置文件需要在当前源码目录下面
    @Test
    public void test4() throws IOException{
        Properties p = new Properties();
        InputStream is = ClassLoader.getSystemClassLoader().getSystemResourceAsStream("info1.properties");

        p.load(is);
        System.out.println(p.getProperty("name") + p.getProperty("password"));
    }

}
