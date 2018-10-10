package com.Orcale.Chapter8.Homework;

public class PrintThread extends Thread{

	private Print p;
	private int num;
	private char word;
	
	public PrintThread() {
		
	}
	
	public PrintThread(int num, char word) {
		this.num = num;
		this.word = word;
	}
	
	@Override
	public void run() {
		super.run();
		while(true) {
			if(num <= 52) {
				p.numPrint();
			}else if(word < 'A'+26){
				p.wordPrint();
			}else {
				break;
			}
		}
	}
		
}
