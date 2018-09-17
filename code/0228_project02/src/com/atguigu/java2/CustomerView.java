package com.atguigu.java2;

/*
 * 
 * 操作界面上的增删改查
 */
public class CustomerView {

	private CustomerList list;

	public CustomerView() {
		list = new CustomerList(10);
		list.addCustomer(new Customer("小泽泽", '女', 18, "1532222222", "jingdong@qq.com"));
	}

	public static void main(String[] args) {
		new CustomerView().enterMainMenu();
	}

	/**
	 * 进入主菜单
	 */
	public void enterMainMenu() {
		/*
		 * -----------------客户信息管理软件----------------- 1 添 加 客 户 2 修 改 客 户 3 删 除
		 * 客 户 4 客 户 列 表 5 退 出 请选择(1-5)：2
		 */
		boolean isFlag = true;
		do {
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                 1 添 加 客 户");
			System.out.println("                 2 修 改 客 户");
			System.out.println("                 3 删 除 客 户");
			System.out.println("                 4 客 户 列 表");
			System.out.println("                 5 退       出");
			System.out.print("                  请选择(1-5)：");
			// 读取菜单项
			char readMenuSelection = CMUtility.readMenuSelection();
			switch (readMenuSelection) {
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
					/*
						确认是否退出(Y/N):n
					 */
				System.out.print("确认是否退出(Y/N):");
				char selection = CMUtility.readConfirmSelection();
				if(selection == 'Y'){
					isFlag = false;
					System.out.println("退出成功");
				}
				break;
			}
		} while (isFlag);
	}

	/**
	 * 添加新用户
	 */
	private void addNewCustomer() {
		/*
		 * ---------------------添加客户---------------------
			姓名:小龙哥
			性别:男
			年龄:16
			电话:110
			邮箱:120@qq.com
			---------------------添加完成---------------------
		 */
		System.out.println("---------------------添加客户---------------------");
		System.out.print("姓名:");
		String name = CMUtility.readString(10);
		System.out.print("性别:");
		char gender = CMUtility.readChar();
		System.out.print("年龄:");
		int age = CMUtility.readInt();
		System.out.print("电话:");
		String phone = CMUtility.readString(11);
		System.out.print("邮箱:");
		String email = CMUtility.readString(20);
		//保存到数组中
		boolean addCustomer = list.addCustomer(new Customer(name, gender, age, phone, email));
		if(addCustomer){
			System.out.println("---------------------添加完成---------------------");
		}else{
			System.out.println("---------------------添加失败---------------------");
		}
	}

	/**
	 * 修改用户
	 */
	private void modifyCustomer() {
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
		System.out.println("---------------------修改客户---------------------");
		Customer customer = null;
		int readInt = 0;
		//根据index读取用户是否存在
		while(true){
			System.out.print("请选择待修改客户编号(-1退出)：");
			readInt = CMUtility.readInt();
			if(readInt == -1){
				return;
			}
			//去数组中查找是否有此人
			customer = list.getCustomer(readInt - 1);
			if(customer == null){ //没有找到此人
				System.out.println("无法找到指定用户");
			}else{//找到用户了
				break;
			}
		}
		//从键盘读取新的用户的信息
		System.out.print("姓名(" + customer.getName() + "):");
		String name = CMUtility.readString(10, customer.getName());
		System.out.print("性别(" + customer.getGender() + "):");
		char gender = CMUtility.readChar(customer.getGender());
		System.out.print("年龄(" + customer.getAge() + "):");
		int age = CMUtility.readInt(customer.getAge());
		System.out.print("电话(" + customer.getPhone() + "):");
		String phone = CMUtility.readString(11, customer.getPhone());
		System.out.print("邮箱(" + customer.getEmail() + "):");
		String email = CMUtility.readString(11,customer.getEmail());
		
		//在数组中将旧的用户替换成新的用户
		boolean replaceCustomer = list.replaceCustomer(readInt - 1, new Customer(name, gender, age, phone, email));
		if(replaceCustomer){
			System.out.println("---------------------修改完成---------------------");
		}else{
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
		System.out.println("---------------------删除客户---------------------");
		int readInt = 0;
		while(true){
			System.out.print("请选择待删除客户编号(-1退出)：");
			readInt = CMUtility.readInt();
			if(readInt == -1){
				return;
			}
			//查找客户是否存在
			Customer customer = list.getCustomer(readInt - 1);
			if(customer == null){ //没有找到该用户
				System.out.println("无法找到该用户");
			}else{//找到了用户
				break;
			}
		}
		System.out.print("确认是否删除(Y/N):");
		char selection = CMUtility.readConfirmSelection();
		if(selection == 'Y'){
			//从数组中删除用户
			boolean deleteCustomer = list.deleteCustomer(readInt - 1);
			if(deleteCustomer){
				System.out.println("---------------------删除完成---------------------");
			}else{
				System.out.println("---------------------删除失败---------------------");
			}
		}
		
	}

	/**
	 * 显示所有用户
	 */
	private void listAllCustomers() {
		/*
		 * ---------------------------客户列表---------------------------
			编号	姓名	性别	年龄	电话		邮箱
			1	小井	男	18	110		aaa@qq.com
			2	小泽泽	女	14	120		qqq@qq.com
			--------------------------客户列表完成-------------------------
		 */
		System.out.println("---------------------------客户列表---------------------------");
		System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
		Customer[] allCustomers = list.getAllCustomers();
		if(allCustomers.length == 0){
			System.out.println("亲您还没有添加用户哦");
		}else{
			for (int i = 0; i < allCustomers.length; i++) {
				Customer customer = allCustomers[i];
				System.out.println(i + 1 + "\t" + customer.getName() + "\t" + customer.getGender() + "\t" 
				+ customer.getAge() + "\t" + customer.getPhone() + "\t\t" + customer.getEmail());
			}
		}
		
		System.out.println("--------------------------客户列表完成-------------------------");
	}

}
