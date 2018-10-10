package com.Orcale.Chapter8.Homework;

public class SellWindow extends Thread{
	
	public String setName() {
		return setName();
		
	}

	private Tickets t;
	
	public SellWindow(Tickets t) {
		this.t = t;
	}
	
	
	
	@Override
	public void run() {
		super.run();
		while(true) {
			t.buyTicket();
			if(t.getticketNum() > 100) 
			break;
		}
	}
}
