package org.ai88.chapter07.learnSuper.exer;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/25 19:46
 */
public class Interview02 {
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo()); // aaa
        System.out.println(s.getInfo()); // aaa
        s.test(); // aaa aaa
        System.out.println("-------------------------");
        s.setInfo("ccc");
        System.out.println(f.getInfo()); // aaa
        System.out.println(s.getInfo()); // ccc
        s.test(); // ccc aaa
    }
}

class Father{
    private String info = "aaa";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

class Son extends Father{
   private String info = "bbb";

   public void test(){
       System.out.println(this.getInfo());
       System.out.println(super.getInfo());
   }

    public String getInfo() {
        return info;
    }
}
