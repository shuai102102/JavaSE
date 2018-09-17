package com.atguigu.java2;

public class CustomerView {
	private CustomerList list;

	public CustomerView() {
		list = new CustomerList(10);
		list.addCustomerList(new Customer("小星星", '男', 23, "13111143430", "www.97gan.com"));
	}

	/*
	 * 进入主菜单
	 */
	public static void main(String[] args) {
		new CustomerView().enterMainMenu();
	}

	public void enterMainMenu() {

		boolean isFlag = true;
		do {
			System.out.println("---------------客户信息管理软件-------------");
			System.out.println("               1 添加客户");
			System.out.println("               2 修改客户");
			System.out.println("               3 删除客户");
			System.out.println("               4 客户列表");
			System.out.println("               5 退       出");
			System.out.print("        请选择(1-5)：");

			char selection = CMUtility.readMenuSelection();
			switch (selection) {

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
				System.out.print("请确认是否退出(Y/N): ");
				char comfirm = CMUtility.readConfirmSelection();
				if (comfirm == 'Y') {
					isFlag = false;
					System.out.println("退出成功");
				}
				break;
			}

		} while (isFlag);
	}

	/*
	 * ---------------------添加客户---------------------
		姓名:小龙哥
		性别:男
		年龄:16
		电话:110
		邮箱:120@qq.com
		---------------------添加完成---------------------
	 */

	private void addNewCustomer(){
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名： ");
		String name = CMUtility.readString(10);
		System.out.print("性别： ");
		char gender = CMUtility.readChar();
		System.out.print("年龄： ");
		int age = CMUtility.readInt();
		System.out.print("电话： ");
		String phone = CMUtility.readString(11);
		System.out.print("邮箱： ");
		String email = CMUtility.readString(20);
		
		boolean addCustomer = list.addCustomerList(new Customer(name, gender, age, phone, email));
		if (addCustomer) {
			System.out.println("---------------------用户添加成功---------------------");
		}else {
			System.out.println("---------------------用户添加失败---------------------");
		}
	}
	/*
	 * 修改用户
	 */
	private void modifyCustomer(){
		/*
		 * ---------------------修改客户---------------------
			请选择待修改客户编号(-1退出)：2
			姓名(小泽泽):
			性别(女):
			年龄(14):
			电话(120):
			邮箱(qqq@qq.com):
			---------------------修改完成--------------------- 
		 */
		Customer cust = null;
		int xuhao = 0;
		System.out.println("---------------------修改客户---------------------");
		while(true){
		System.out.println("请选择待修改客户编号(-1退出)：");	
		xuhao = CMUtility.readInt();
		if(xuhao == -1){
			return;
		}
		cust = list.getCustomer(xuhao-1) ;
		if (cust == null) {
			System.out.println("查无此人");
		}else{
			break;
			}
		}
		
		System.out.print("姓名("+cust.getName()+")： ");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别("+cust.getGender()+")： ");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(11, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(20, cust.getEmail());
		
		boolean replace = list.replaceCustomer(xuhao-1, new Customer(name, gender, age, phone, email));
		if(replace){
			System.out.println("---------------------修改成功---------------------");
		}else {
			System.out.println("---------------------修改失败---------------------");
		}
		
	}
	
	
	/**
	 * 删除用户
	 */
	private void deleteCustomer(){
		
		/*
		 * ---------------------删除客户---------------------
			请选择待删除客户编号(-1退出)：2
			无法找到该用户
			请选择待删除客户编号(-1退出)：1
			确认是否删除(Y/N):y
			---------------------删除完成---------------------
		 */
		System.out.println("---------------------删除用户---------------------");
		int number = 0;
		while(true){
			System.out.print("请选择待删除客户编号(-1退出)：");
			number = CMUtility.readInt();
			if (number ==-1) {
				return;
				}
			if (list.getCustomer(number-1) == null) {
				System.out.println("亲~~~~您查找的用户不存在");
				}else {
				break;
				}
			}
		System.out.print("确认是否删除(Y/N):");
		char comfirmDelete = CMUtility.readConfirmSelection();
		if (comfirmDelete == 'Y') {
			boolean delete = list.deleteCustomer(number-1);
			if (delete) {
				System.out.println("---------------------删除成功---------------------");
			}else {
				System.out.println("---------------------删除失败---------------------");
			}
			
		}
	}
	
	private void listAllCustomers(){
		/*
		 * ---------------------------客户列表---------------------------
			编号	姓名	性别	年龄	电话		邮箱
			1	小井	男	18	110		aaa@qq.com
			2	小泽泽	女	14	120		qqq@qq.com
			--------------------------客户列表完成-------------------------
		 */
		System.out.println("---------------------用户列表如下---------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		Customer[] c = list.getAllCustomers();
		if ( c.length == 0) {
			System.out.println("亲~~~您还没有添加用户哦，嘤嘤嘤");
		}else{
			for (int i = 0; i < c.length; i++) {
				System.out.println(i+1+"\t"+c[i].getName()+"\t"+c[i].getGender()
						+"\t"+c[i].getAge()+"\t"+c[i].getPhone()+"\t\t"+c[i].getEmail());
			}
		}
		
	}
	
	
}

	
