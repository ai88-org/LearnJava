package org.ai88.chapter07.polymorphism.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/28 18:50
 */
public class GeometricObject {
    private String color;
    private double weight;
    public GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
