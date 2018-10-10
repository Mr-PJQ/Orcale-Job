package com.Orcale.Chapter8.Homework;

public class Tickets {
	private int ticketNum = 1;
	
	public int getticketNum() {
		return ticketNum;
		
	}
	
	public synchronized void buyTicket() {
		if(ticketNum <= 100) {
			System.out.println(Thread.currentThread().getName() + "Âô³öÁË£º" + ticketNum + "ºÅÆ±");
			ticketNum++;
		}
	}
	

}
