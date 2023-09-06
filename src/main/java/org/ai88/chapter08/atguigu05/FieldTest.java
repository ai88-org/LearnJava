package org.ai88.chapter08.atguigu05;

/**
 * Description:
 * 成员变量赋值顺序：
 *  默认赋值 -> 显示赋值/代码块赋值 -> 构造器赋值 -> 对象创建之后直接赋值或者方法赋值
 *
 * @Author xuyang
 * @Create 2023/9/6 10:02
 */
public class FieldTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.order);
    }
}

class Order{
    {
        order = 2;
    }

    int order = 1;

    public Order(){
        //order = 3;
    }

    public Order(int order){
        this.order = order;
    }

}
