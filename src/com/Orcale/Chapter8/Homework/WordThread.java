package com.Orcale.Chapter8.Homework;

public class WordThread extends Thread{
	private NumWord n;
	
	public WordThread(NumWord n) {
		this.n = n; 
	}

	@Override
	public void run() {
		super.run();
		while(n.getWord() <= 97) {
			n.wordPrint();
		}
	}
}
