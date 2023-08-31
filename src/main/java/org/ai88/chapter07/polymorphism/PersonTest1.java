package org.ai88.chapter07.polymorphism;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 15:45
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        // 向下转型
        Man m1 = (Man) p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        System.out.println(p1 == m1);

        System.out.println("================================");
        // 唯一的问题：如何判断是否可以强转，假如直接强转就会有类的类型转换错误
        Person p2 = new Woman();
//        Man m2 = (Man) p2;
//        m2.walk();
        if(p2 instanceof Man){
            Man m2 = (Man) p2;
            m2.walk();
        }

        /*
         * 1. 建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常
         * 2. 格式： a instanceOf A : 判断对象a是否是类A的实例。
         * 3. 如果a instanceOf A 返回true，则：
         *       a instanceOf superA 返回也是true。其中，A 是superA的子类。
         * */
        if(p2 instanceof Woman){
            System.out.println("woman");
        }

        if(p2 instanceof Person){
            System.out.println("Person");
        }
        if(p2 instanceof Object){
            System.out.println("Object");
        }


    }
}
