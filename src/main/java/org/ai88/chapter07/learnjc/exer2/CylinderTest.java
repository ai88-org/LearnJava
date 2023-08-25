package org.ai88.chapter07.learnjc.exer2;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/24 9:53
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setLength(1.4);

        System.out.println("圆柱体的体积是："+cylinder.findVolume());
    }
}
