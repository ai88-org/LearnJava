package org.ai88.chapter07.learnOverride;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/24 10:01
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}

    void methodDefault(){}

    protected void methodProtected(){}

    public void methodPublic(){}

    public void show(){
        orderPrivate = 1;
        orderDefault = 1;
        orderProtected = 1;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
