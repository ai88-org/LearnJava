package org.ai88.chapter07.polymorphism.exer4;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/30 18:36
 */
public class Exer4 {
    public static void meeting(Person...  ps){
        for(Person p : ps){
            p.eat();
            p.toilet();

            if (p instanceof Man){
                System.out.println("1");
                ((Man)p).smoke();
            }

            if (p instanceof Woman){
                System.out.println("2");
                ((Woman)p).makeup();
            }

        }
    }

    public static void main(String[] args) {
        Person[] ps = new Person[10];
        for (int i = 0;i<ps.length;i++) {
            if(i % 2==0){
                ps[i] = new Man();
            }else{
                ps[i] = new Woman();
            }
        }

        Exer4.meeting(ps);
    }
}