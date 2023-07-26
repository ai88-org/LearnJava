package org.ai88.chapter03;

/**
 * switch(表达式){
 * case 常量1:
 * xxx;
 * break;
 * case 常量2:
 * xxx;
 * break;
 * ...
 * default:
 * xxx;
 * <p>
 * }
 * <p>
 * 表达式只能是特定的数据类型 byte、short、char、int、枚举类、String(JDK7.0新增)
 * case后面跟的常量，switch中的表达式只能与常量做比较
 * default是可选的，位置是灵活的。不一定放最后
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        // 直接case穿透了，不会去匹配case。
        int num = 10;
        switch (num) {

            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("thre");
                break;
            default:
                System.out.println("other");
        }
    }
}
