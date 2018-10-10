package com.Orcale.Chapter8.Homework;

public class Print {
	private int num = 1;
	private char word = 'A';
	
	public int getNum() {
		return num;
	}

	public char getWord() {
		return word;
	}

	public synchronized void numPrint() {
			if(num / 2 == 0) {
				notifyAll();
			}else {
				System.out.println(num + " " + num+1);
				num += 2;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	
	public synchronized void wordPrint() {
			if(num / 2 == 0) {
				System.out.println(word);
				word++;
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notifyAll();
			}
	}
}
