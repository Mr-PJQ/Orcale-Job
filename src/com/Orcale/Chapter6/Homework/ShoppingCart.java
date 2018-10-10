package com.Orcale.Chapter6.Homework;

import java.util.HashSet;
import java.util.Iterator;

public class ShoppingCart {
	
	private static HashSet<Product> product = new HashSet<Product>();
	
	static Product p1 = new Product(1, "面包", 5.0, 1);
	static Product p2 = new Product(3, "饺子", 10.0, 1);
	static Product p3 = new Product(5, "哇哈哈", 2.0, 1);
	static Product p4 = new Product(4, "汤圆", 15.0, 1);
	static Product p5 = new Product(5, "哇哈哈", 2.0, 2);

	public static void main(String[] args) {
		
		//增删改查操作
		add();
		delete(null);
		modification(0, 0);
		find(null);
		
		
		System.out.println("购物车：");
		Iterator<Product> it = product.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	/**
	 * 添加商品到购物车
	 */
	public static void add() {

		Product p7 = new Product(7, "爽歪歪", 2.0, 5);
		
		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		product.add(p5);
		product.add(p7);
		
	}
	/**
	 * 修改购物车中的商品数量
	 * 只做了按照商品编码(商品编码唯一就没有做查重)查找后，对购物车中商品的数量进行了修改
	 * (个人认为购车中得商品只能做数量修改，其他的基本属性不能由用户修改)
	 * @param productNumber
	 * @param productQuantity
	 */
	public static void modification(int productNumber,int productQuantity) {
		
		Iterator<Product> i = product.iterator();
		while(i.hasNext()) {
			Product p = i.next();
			if(p.getProductNumber() == productNumber) {
				//默认用户修改商品数量为0时自动删除该商品
				if(productQuantity == 0) {
					product.remove(p);
				}else if(productQuantity > 0) {
					p.setProductQuantity(productQuantity);
				}else {
					System.err.println("输入的商品数量不规范！");
					System.err.println("修改失败！");
				}
			}
		}
		
	}
	/**
	 * 删除购物车中的商品
	 */
	public static void delete(Product p) {
		product.remove(p);
	}
	/**
	 * 查找购物车中已存在的商品
	 * 按商品名称查找
	 * @param productName
	 */
	public static void find(String productName) {
		try {
			Iterator<Product> i = product.iterator();
			while(i.hasNext()) {
				Product p = i.next();
				if(!productName.isEmpty() && p.getProductName().equals(productName)) {
					System.out.println("查询结果：");
					System.out.println(p);
					break;
				}
				if(i.hasNext() == false) {
					System.err.println("购物车中没有此商品！");
				}
			}
		}catch (NullPointerException e) {
			e.getStackTrace();
		}
	}

}
