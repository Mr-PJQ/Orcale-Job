package com.Orcale.Chapter8.Homework;

public class Print {

	public static void main(String[] args) {
		NumWord n = new NumWord();
		
		NumThread nt = new NumThread(n);
		WordThread wt = new WordThread(n);
		
		nt.start();
		wt.start();
		
	}

}
