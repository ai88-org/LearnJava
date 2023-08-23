package org.ai88.project02;

/**
 * Description:
 * CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 *
 * @Author XuYang
 * @Create 2023/8/21 10:17
 */
public class CustomerList {
    private Customer[] customers;
    // 实际非null的对象
    private int total;

    /**
     * 初始化
     *
     * @param totalCustomer 列表所能包含的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加对象到数组
     *
     * @param customer
     * @return 成功添加返回true，添加失败或者数组已满返回false
     */
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total] = customer;
            return true;
        }
        return false;
    }

    /**
     * 替换指定元素的属性信息
     *
     * @param index
     * @param customer
     * @return
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= 0 && index < total) {
            customers[index] = customer;
            return true;
        }
        return false;
    }

    /**
     * 删除指定的，删除之后还需要把后面的元素递补到前面
     *
     * @param index
     * @return 删除成功返回true，失败返回false
     */
    public boolean deleteCustomer(int index) {
        if(index <0 && index >= total){
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
//        customers[total - 1] = null;
//        total--;
        customers[--total] = null;
        return true;
    }

    /**
     * 返回数组中所有对象
     * @return Customer[] 的长度与数组中对象个数一致
     */
    public Customer[] getAllCustomers() {
        Customer[] customers1 = new Customer[total];
        for(int i=0;i<total;i++){
            customers1[i] = customers[i];
        }
        return customers1;
    }

    /**
     *
     * @param index 索引
     * @return 成功返回具体的对象，不成功返回Null
     */
    public Customer getCustomer(int index){
        if(index >=0 && index < total){
            return customers[index];
        }
        return null;
    }

    public int getTotal(){
        return total;
    }
}
