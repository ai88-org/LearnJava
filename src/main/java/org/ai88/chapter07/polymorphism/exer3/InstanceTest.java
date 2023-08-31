package org.ai88.chapter07.polymorphism.exer3;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/29 10:46
 */
public class InstanceTest {
    public void method(Person e){
        if(e instanceof Graduate){
            System.out.println("a graduated student");
        }
        if(e instanceof Student){
            System.out.println("a student");
        }
        if(e instanceof Person){
            System.out.println("a person");
        }
    }
}
