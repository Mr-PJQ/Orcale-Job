package com.Orcale.Chapter6.Homework;

public class Product {
	private int productNumber;
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	public Product() {
		
	}
	
	public Product(int productNumber, String productName, double productPrice, int productQuantity) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	/**
	 * 商品的编号和商品名称都是唯一的，不能重复
	 * 只计算商品编号和商品名称的Hash码
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productNumber;
		return result;
	}

	@Override
	/**
	 * 用equals判断Hash码相同的商品
	 * 然后将添加的重复商品的数量与已有商品的数量相加，重新赋值给商品数量
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			productQuantity ++;
			return true;
		}		
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productNumber != other.productNumber)
			return false;
		
		other.productQuantity += productQuantity;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQuantity=" + productQuantity + "]";
	}
	
}
	
	

