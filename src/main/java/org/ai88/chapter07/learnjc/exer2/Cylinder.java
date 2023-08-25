package org.ai88.chapter07.learnjc.exer2;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/23 22:08
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * length;
    }
}
