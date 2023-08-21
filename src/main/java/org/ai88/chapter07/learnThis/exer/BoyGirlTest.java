package org.ai88.chapter07.learnThis.exer;

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("杰克",24);
        Girl girl1 = new Girl("朱丽叶",19);

        girl1.marry(boy1);

        boy1.shout();

        Girl girl2 = new Girl("露丝",18);
        girl1.compare(girl2);
    }
}
