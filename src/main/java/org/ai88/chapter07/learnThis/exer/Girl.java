package org.ai88.chapter07.learnThis.exer;

public class Girl {
    private String namne;
    private int age;

    public String getNamne() {
        return namne;
    }

    public void setNamne(String namne) {
        this.namne = namne;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getNamne());
        boy.marry(this);
    }

    /**
     * 比较两个girl对象
     *
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小；0：两个对象一样大
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public Girl() {
    }

    public Girl(String namne, int age) {
        this.namne = namne;
        this.age = age;
    }
}
