package org.ai88.chapter07.learnThis.exer;

public class Boy {
    private String namne;
    private int age;

    public Boy(String namne, int age) {
        this.namne = namne;
        this.age = age;
    }

    public Boy() {
    }

    public String getNamne() {
        return namne;
    }

    public void setNamne(String namne) {
        this.namne = namne;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getNamne());
    }

    public void shout() {
        if(age>22){
            System.out.println("我可以结婚了");
        }else{
            System.out.println("只能谈恋爱了");
        }

    }
}
