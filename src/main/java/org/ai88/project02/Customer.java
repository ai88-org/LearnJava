package org.ai88.project02;

public class Customer {
    private String name;
    // 性别
    private char gender;
    private int age;
    private String phone;
    private String email;

    /**
     *
     * @param name 姓名
     * @param gender 性别
     * @param age 年龄
     * @param phone 电话
     * @param email 邮箱
     */
    public Customer(String name,char gender,int age,String phone,String email){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
