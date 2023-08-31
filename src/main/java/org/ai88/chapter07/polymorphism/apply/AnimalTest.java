package org.ai88.chapter07.polymorphism.apply;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/29 10:16
 */
public class AnimalTest {
    public void adopt(Animal animal){ //Animal animal = new Dog()
        animal.eat();
        animal.jump();
    }

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();

        test.adopt(new Dog());
        test.adopt(new Cat());
    }
}

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }

    public void jump(){
        System.out.println("动物跳");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}