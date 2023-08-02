package org.ai88.chapter05.functionexer.exer4;

/**
 * n个字符串拼接，每一个字符串之间使用某字符串进行分割
 * 如果没有传入字符串，那么返回空字符串“”
 */
public class Exer1 {
    public String getStr(String split,String ... str){
        String strs="";
        for(int i=0;i<str.length;i++){
            strs += split+str[i];
        }
        return strs;
    }
}

class Exer1Test{
    public static void main(String[] args) {
        Exer1 e1 = new Exer1();
        System.out.println(e1.getStr("|","我","是","你","大","爷"));
        System.out.println(e1.getStr("|","我"));
    }
}
