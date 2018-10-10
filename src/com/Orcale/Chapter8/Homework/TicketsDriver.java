package com.Orcale.Chapter8.Homework;

public class TicketsDriver {

	public static void main(String[] args) {
		Tickets t = new Tickets();
		SellWindow w1 = new SellWindow(t);
		SellWindow w2 = new SellWindow(t);
		SellWindow w3 = new SellWindow(t);
		SellWindow w4 = new SellWindow(t);
		SellWindow w5 = new SellWindow(t);
		
		w1.setName("w1");
		w2.setName("w2");
		w3.setName("w3");
		w4.setName("w4");
		w5.setName("w5");
		
		
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		w5.start();
	}

}
