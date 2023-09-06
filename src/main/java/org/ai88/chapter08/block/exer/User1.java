package org.ai88.chapter08.block.exer;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/6 9:39
 */
public class User1 {
    private String userName;
    private String password;
    private long registrationTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    // 非静态代码块抽出构造器相同的部分
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
    }

    public User1() {
        userName = System.currentTimeMillis()+"";
        password = "123456";
    }

    public User1(String userName, String password){
        System.out.println("1111");
        this.userName = userName;
        this.password = password;
    }

    public String getInfo(){
        return "用户名："+userName+" 密码："+password+"，注册时间："+registrationTime;
    }
}
