package org.ai88.chapter07.equals;

import java.util.Objects;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/9/1 10:28
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("张三",18);
        User u2 = new User("张三",18);
        System.out.println(u1.equals(u2));

        float a1 = 12.0f;
        int a2 = 12;
        System.out.println(a2 == a1);
    }
}

class User {
    String name;
    int age;

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            return this.age == ((User) obj).age && this.name.equals(((User) obj).name);
        }
        return false;
    }



}
