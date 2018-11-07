package com.Orcale.Chapter8.Homework;

public class NumWord {
	private int num = 1;
	private char word = 65;
	
	public int getNum() {
		return num;
	}
	
	public char getWord() {
		return word;
	}

	public synchronized void numPrint() {
				System.out.print(num + " " + (num+1) + " ");
				num += 2;
				notifyAll();
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	}
	
	public synchronized void wordPrint() {
		System.out.print(word + " ");
		word++;
		notifyAll();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
