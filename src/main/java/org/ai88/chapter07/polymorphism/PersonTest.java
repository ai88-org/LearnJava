package org.ai88.chapter07.polymorphism;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 14:32
 */
public class PersonTest {
    public static void main(String[] args) {
        // 多态性之前的场景
        Person p1 = new Person();
        Man m1 = new Man();

        // 多态性子类对象的多态
        Person p2 = new Man();

        /*
        多态性的运用：虚拟方法调用

        在多态的场景下，调用方法时。
            编译时，认为方法是是左边声明的父类的类型方法
            执行时，实际执行的是子类重写父类的方法
        简称为：编译看左边，运行看右边
         */
        // 都是子类的方法
        p2.eat();
        p2.walk();

        // 测试属性是否满足多态性 不满足
        System.out.println(p2.id); // 1001

        /**
         * 多态的弊端
         * 问题：Person p2 = new Man();
         *  针对于创建的对象，在内存中是否加载了Man类中声明的特有的属性和方法？ 加载了！
         *  问题：能不能直接调用Man中加载的特有的属性和方法呢？不能
         *  所以一般只运用在虚拟方法中的形参
         */
        /*p2.earnMoney();
        System.out.println(p2.isSmoking);*/
    }
}
