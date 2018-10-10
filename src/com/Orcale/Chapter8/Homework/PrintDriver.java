package com.Orcale.Chapter8.Homework;

public class PrintDriver {

	public static void main(String[] args) {
		Print p = new Print();
		PrintThread t = new PrintThread();
		t.start();
	}

}
