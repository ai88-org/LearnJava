package org.ai88.chapter07.learnjc.exer2;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/23 18:58
 */
public class Circle {
    private double radius;

    public Circle(){
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }
}
