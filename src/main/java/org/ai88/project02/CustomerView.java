package org.ai88.project02;

/**
 * Description:
 *
 * @Author xuyang
 * @Create 2023/8/22 10:17
 */
public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    /**
     * 进入主界面
     */
    public void enterMainMenu(){
        boolean flag = true;

        while (flag){
            System.out.println("\n-----------------电商客户管理系统-----------------\n");
            System.out.println("\t\t1 添加客户");
            System.out.println("\t\t2 修改客户");
            System.out.println("\t\t3 删除客户");
            System.out.println("\t\t4 客户列表");
            System.out.println("\t\t5 退   出\n");
            System.out.print("\t\t请选择（1-5）：");

            char c = CMUtility.readMenuSelection();

            switch (c){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("是否确认退出: ");
                    char c1 = CMUtility.readConfirmSelection();
                    if(c1 == 'Y'){
                        flag = false;
                    }
                    break;
            }
        }
    }

    private void addNewCustomer(){}

    private void modifyCustomer(){}

    private void deleteCustomer(){}

    private void listAllCustomers(){}

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
