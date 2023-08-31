package org.ai88.chapter07.polymorphism.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 20:12
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest g3 = new GeometricTest();
        GeometricObject g1 = new Circle(3,"red",0.1);
        GeometricObject g2 = new MyRectangle(3,4,"red",0.1);
        System.out.println(g3.displayGeometricObject(g1));
        System.out.println(g3.displayGeometricObject(g2));
        System.out.println(g3.equalsArea(g1,g2));
    }

    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public double displayGeometricObject(GeometricObject g){
        return g.findArea();
    }
}
