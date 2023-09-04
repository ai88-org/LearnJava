package org.ai88.chapter08.singleton;

public class Hello {
    static String hello = "你好";
    public static void sayHello(){
        System.out.println("say hello");
    }
}

class HelloTest{
    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1 = null;
        System.out.println(h1.hello);
        h1.sayHello();
    }
}
