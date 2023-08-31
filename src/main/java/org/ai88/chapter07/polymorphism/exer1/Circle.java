package org.ai88.chapter07.polymorphism.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 18:50
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    @Override
    public double findArea(){
        return Math.PI * radius *radius;
    }
}
