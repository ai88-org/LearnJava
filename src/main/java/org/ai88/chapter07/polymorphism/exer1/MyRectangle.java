package org.ai88.chapter07.polymorphism.exer1;

/**
 * Description:
 * 矩形
 *
 * @Author xuyang
 * @Create 2023/8/28 18:51
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(double width,double height,String color,double weight){
        super(color,weight);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea(){
        return width * height;
    }
}
