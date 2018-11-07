package com.Orcale.Chapter8.Homework;

public class NumThread extends Thread {
	private NumWord n;
	
	public NumThread(NumWord n) {
		this.n = n;
	}

	@Override
	public void run() {
		super.run();
		while(n.getNum() <= 52) {
			n.numPrint();
		}
	}
}
