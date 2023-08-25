package org.ai88.chapter07.learnjc.exer1;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/23 17:39
 */
public class ManKind {
    int sex;
    int salary;

    public void manOrWoman(){
        if(sex==1){
            System.out.println("man");
        }else if(sex ==0 ){
            System.out.println("woman");
        }else{
            System.out.println("not know");
        }
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("has job");
        }
    }
}
