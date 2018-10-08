/**
 * 
 */
package com.Orcale.SupermarketManagementSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.oraclesdp.common.SystemIn;

/**
 * @author 安(an) 这是一个基于控制台的简易的超市管理系统
 */
public class SMMS {

	/**
	 *  在类里面定义一些变量，用来记录程序运行时需要使用的数据 
	 *adminUsername 账户 
	 *adminPassword 密码 
	 *productName 商品名称 
	 *productPrice 商品价格 
	 *productNumber 商品数量 
	 *productDate 商品日期 
	 *number 超市商品种类数量
	 * 
	 */
	static String adminUsername = "admin";
	static String adminPassword = "123456";
	static String[] productName = new String[100];
	static double[] productPrice = new double[100];
	static int[] productNumber = new int[100];
	static String[] productDate = new String[100];
	static int number = 0;

	/**
	 * @param args 程序从main函数开始进入欢迎界面
	 */
	public static void main(String[] args) {

		showWelcome();
	}

	/**
	 * 这是超市管理系统的启动的欢迎界面
	 */
	public static void showWelcome() {
		System.out.println("**************************************");
		System.out.println("*************欢迎来到帅帅超市**************");
		System.out.println("*************帅帅免费 马飞十倍**************");
		System.out.println("**************************************");

		login();
	}

	/**
	 * 这是超市管理系统的登录界面
	 */
	public static void login() {
		System.out.println("菜单：");
		System.out.println("1.登录");
		System.out.println("2.退出");

		// 输入你的选择
		int yourChooseID = SystemIn.nextInt();

		if (yourChooseID == 1) {

			// 当登录三次失败后，超市管理系统将自动退出程序
			int count = 1;
			while (count <= 3) {

				System.out.println("请输入账户：");
				String username = SystemIn.nextLine();
				System.out.println("请输入密码：");
				String password = SystemIn.nextLine();

				// 判断账户和密码与系统分配的是否匹配
				if (username.equals(adminUsername) && password.equals(adminPassword)) {
					System.out.println("登陆成功！");
					productMenu();
					break;
				} else {
					System.err.println("账户或密码错误，请重新输入：");
					count++;
					continue;
				}
			}
		}
		if (yourChooseID == 2) {
			System.exit(0);
		} else {
			System.err.println("输入错误！请重新输入：");// 没有这个选择，输入错误，要求重新输入
			login();
		}
	}

	/**
	 * 商品菜单
	 */
	public static void productMenu() {
		System.out.println("商品菜单:");
		System.out.println("1.查看商品列表");
		System.out.println("2.添加商品");
		System.out.println("3.修改商品");
		System.out.println("4.删除商品");
		System.out.println("5.返回");
		System.out.println("6.退出");

		int MenuID = SystemIn.nextInt();

		switch (MenuID) {
		case 1: {
			showProduct();
			break;
		}
		case 2: {
			addProduct();
			break;
		}
		case 3: {
			modifyProduct();
			break;
		}
		case 4: {
			removeProduct();
			break;
		}
		case 5: {
			login();
			break;
		}
		case 6: {
			System.exit(0);
		}
		default: {
			System.err.println("输入错误！请重新输入：");// 没有这个选择，输入错误，要求重新输入
			productMenu();
		}
		}

	}

	/**
	 * 商品列表
	 */
	public static void showProduct() {

		if (number != 0) {
			System.out.println("超市商品：");
			System.out.println(" 商品名称  " + " 商品价格 " + " 商品数量 " + " 商品日期 ");
			for (int i = 0; i < number; i++) {
				System.out.println("  " + productName[i] + "          " + productPrice[i] + "          "
						+ productNumber[i] + "          " + productDate[i]);
			}
		} else {
			System.err.println("超市没有商品，请及时添加商品！");

		}

		System.out.println("1.返回");
		System.out.println("2.退出");
		int showProductID = SystemIn.nextInt();
		switch (showProductID) {
		case 1: {
			productMenu();
			break;
		}
		case 2: {
			System.exit(0);
		}
		default: {
			System.err.println("输入错误！请重新输入：");// 没有这个选择，输入错误，要求重新输入
			showProduct();
		}
		}
	}

	/**
	 * 添加商品
	 */
	public static void addProduct() {
		System.out.println("添加商品：");
		// 获取商品名称、价格、数量、添加时间
		System.out.println("请输入商品名称：");
		String productName = SystemIn.nextLine();

		// 如果超市已有该商品，不能再添加
		for (int i = 0; i < number; i++) {
			if (SMMS.productName[i].equals(productName)) {
				System.err.println("超市已有该商品，不能再添加！");
				System.err.println("请重新添加：");
				addProduct();
			}
		}

		System.out.println("请输入商品价格：");
		double productPrice = SystemIn.nextDouble();
		System.out.println("请输入商品数量：");
		int productNumber = SystemIn.nextInt();
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm");

		SMMS.productName[number] = productName;
		SMMS.productPrice[number] = productPrice;
		SMMS.productNumber[number] = productNumber;
		SMMS.productDate[number] = time.format(new Date());

		number++;

		System.out.println("1.继续添加");
		System.out.println("2.返回");
		int addProduct = SystemIn.nextInt();

		switch (addProduct) {
		case 1: {
			addProduct();
			break;
		}
		case 2: {
			productMenu();
			break;
		}
		default: {
			System.err.println("输入错误！请重新输入：");// 没有这个选择，输入错误，要求重新输入
			addProduct();
		}
		}

	}

	/**
	 * 修改商品
	 */
	public static void modifyProduct() {
		int i;
		System.out.println("修改商品：");
		System.out.println("请输入要修改的商品名称：");
		String modifyProductName = SystemIn.nextLine();

		// 查找要修改的商品的信息
		for (i = 0; i < number; i++) {
			if (modifyProductName.equals(productName[i])) {
				System.out.println("修改的商品信息：");
				System.out.println(" 商品名称  " + " 商品价格 " + " 商品数量 " + " 商品日期 ");
				System.out.println("  " + productName[i] + "          " + productPrice[i] + "          "
						+ productNumber[i] + "          " + productDate[i]);

				// 填写修改后的的商品信息
				System.out.println("修改后的商品信息：");
				System.out.println("请输入商品名称：");
				String productName = SystemIn.nextLine();

				// 修改后的商品名称不能与已有商品重名
				for (int n = 0; n < number; n++) {
					if (SMMS.productName[i].equals(productName)) {
						System.err.println("商品名称与已有商品重名！");
						System.err.println("请重新修改：");
						modifyProduct();
					}
				}

				System.out.println("请输入商品价格：");
				double productPrice = SystemIn.nextDouble();
				System.out.println("请输入商品数量：");
				int productNumber = SystemIn.nextInt();
				SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd hh:mm");

				SMMS.productName[i] = productName;
				SMMS.productPrice[i] = productPrice;
				SMMS.productNumber[i] = productNumber;
				SMMS.productDate[i] = time.format(new Date());

				break;
			}
		}
		// 在超市中没有找到商品时
		if (i == number) {
			System.err.println("超市没有此商品！");
		}

		System.out.println("1.继续修改");
		System.out.println("2.返回");
		int modifyProductID = SystemIn.nextInt();

		switch (modifyProductID) {
		case 1: {
			modifyProduct();
			break;
		}
		case 2: {
			productMenu();
			break;
		}
		default: {
			System.err.println("输入错误！请重新输入：");// 没有这个选择，输入错误，要求重新输入
			modifyProduct();
		}
		}
	}

	/**
	 * 删除商品
	 */
	public static void removeProduct() {
		int i;
		if (number == 0) {
			System.err.println("超市没有商品，不能删除！");
			System.err.println("请重新选择：");
			productMenu();
			
		} else {
			System.out.println("删除商品：");
			System.out.println("请输入删除的商品名称：");
			String removeProductName = SystemIn.nextLine();

			// 查找要删除的商品信息
			for (i = 0; i < number; i++) {
				if (removeProductName.equals(productName[i])) {
					System.out.println("删除的商品信息：");
					System.out.println(" 商品名称  " + " 商品价格 " + " 商品数量 " + " 商品日期 ");
					System.out.println("  " + productName[i] + "          " + productPrice[i] + "          "
							+ productNumber[i] + "          " + productDate[i]);

					for (int j = i + 1; j < number; j++) {
						productName[j - 1] = productName[j];
						productPrice[j - 1] = productPrice[j];
						productNumber[j - 1] = productNumber[j];
						productDate[j - 1] = productDate[j];
					}
					number--;
					break;
				}
				// 在超市中没有找到商品时
				if (i == number) {
					System.err.println("超市没有此商品！");
			}

			}

			System.out.println("1.继续删除");
			System.out.println("2.返回");
			int modifyProductID = SystemIn.nextInt();

			switch (modifyProductID) {
			case 1: {
				removeProduct();
				break;
			}
			case 2: {
				productMenu();
				break;
			}
			default: {
				System.err.println("输入错误！请重新输入：");// 没有这个选择，输入错误，要求重新输入
				removeProduct();
			}
			}

		}
	}

}
