package org.ai88.chapter08._abstract;

abstract class Template {
    public abstract void code();

    public void spend() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

class Printprimenum extends Template {
    @Override
    public void code() {
        for (int i = 2; i < 100000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // 不是素数
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}

public class TemplateTest{
    public static void main(String[] args) {
        Template t = new Printprimenum();
        t.spend();
    }
}
