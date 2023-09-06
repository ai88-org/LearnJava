package org.ai88.chapter08.atguigu05.exer;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/6 10:45
 */
class Root{
    // 1
    static{
        System.out.println("Root的静态初始化块");
    }
    // 2
    {
        System.out.println("Root的普通初始化块");
    }
    // 3
    public Root(){
        super();
        System.out.println("Root的无参数的构造器");
    }
}

class Mid extends Root{
    // 4
    static{
        System.out.println("Mid的静态初始化块");
    }
    // 5
    {
        System.out.println("Mid的普通初始化块");
    }

    // 6
    public Mid(){
        System.out.println("Mid的无参数的构造器");
    }
    // 7
    public Mid(String msg){
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid的带参数构造器，其参数值："
                + msg);
    }
}

class Leaf extends Mid{
    // 8
    static{
        System.out.println("Leaf的静态初始化块");
    }
    // 9
    {
        System.out.println("Leaf的普通初始化块");
    }
    // 10
    public Leaf(){
        //通过super调用父类中有一个字符串参数的构造器
        super("尚硅谷");
        System.out.println("Leaf的构造器");
    }
}

public class LeafTest {
    public static void main(String[] args) {
        new Leaf();
    }
}

/** 类加载（静态初始化代码块） --> 非静态代码块 --> 构造器
 * Root的静态初始化块
 * Mid的静态初始化块
 * Leaf的静态初始化块
 * Root的普通初始化块
 * Root的无参数的构造器
 * Mid的普通初始化块
 * Mid的无参数的构造器
 * Mid的带参数构造器，其参数值：尚硅谷
 * Leaf的普通初始化块
 * Leaf的构造器
 */
