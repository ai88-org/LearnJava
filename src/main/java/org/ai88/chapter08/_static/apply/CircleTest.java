package org.ai88.chapter08._static.apply;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/3 19:21
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.5);
        Circle c2 = new Circle(1.6);
        Circle c3 = new Circle(1.7);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(Circle.total);
    }
}

class Circle{
    private double radius;
    static int total;
    private static int init = 1001;
    private int id;

    public Circle(){
        this.id = init;
        init ++;
        total ++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
