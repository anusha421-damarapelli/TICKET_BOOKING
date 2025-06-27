package com.ticket;

import java.util.ArrayList;
import java.util.Iterator;

public class Irctc {
	private Ticket t;
	ArrayList<Ticket>ticket=new ArrayList<Ticket>();
	//TICKET BOOKING 
	public void ticketBooking(Ticket t) {
		ticket.add(t);
		System.out.println("TICKET BOOKED SUCESSFULLY");
	}
	
	//SHOW TICKET
	public void showBookedDetails() {
		if(ticket.isEmpty()) {
			System.out.println("TICKET IS NOT BOOKED YET");
		}
		else {
			for(Ticket t:ticket)
			{
				t.display();
			}
		}
	}
	
	//SEARCH TICKET BASED ON  TICKET NUMBER
	public void searchTicket(int ticketNo) {
		boolean isTicketFound=false;
		if(ticket.isEmpty()) {
			System.out.println("TICKET IS NOT YET BOOKED");
		}
		else {
			for(Ticket t:ticket) {
				if(t.getTicketNo()==ticketNo){
					System.out.println("TICKET FOUND"+t.getTicketNo());
					isTicketFound=true;
				}
				else {
					System.err.println("YOU ENTERED TICKET NUMBER IS INVALID");
				}
			}
		}
		/*if(isTicketFound==false) {
			System.out.println("YOU ENTERED TICKET NUMBER IS INVALID");
		}*/
	}
	
	//SEARCH TICKET BY BOARDING POINT
	public void searchBoardingPoint(String boardingPoint) {
		boolean isBoardingPoint=false;
		if(ticket.isEmpty()) {
			System.out.println("TICKET NOT BOOKED YET");
		}
		else {
			for(Ticket t:ticket) {
				if(t.getBoardingPoint().equalsIgnoreCase(boardingPoint)) {
					System.out.println("TICKET FOUND WITH BOARDING POINT:"+t.getBoardingPoint());
					isBoardingPoint=true;
				}
			}
			
		}
		if(isBoardingPoint==false) {
			System.err.println("ENTERED TICKET NUMBER IS INVALID");
		}
		
		}
	
	//UPDATE THE COST BY TICKET NUMBER
	public void updateCost(int ticketNo) {
		boolean isTicketFound=false;
		if(ticket.isEmpty()) {
			System.out.println("TICKET IS NOT BOOKED YET");
		}
		else {
			for(Ticket t:ticket) {
				if(t.getTicketNo()==ticketNo) {
					//isTicketFound=true;
					t.setTicketCost(5000);
					System.out.println("COST IS UPDATED SUCCESSFULLY");
					isTicketFound=true;
				}
			}
		}
		if(isTicketFound==false) {
			System.err.println("ENTERED TICKET NUMBER IS  INVALID");
		}
		
	}
	
	//CANCEL TICKET BY TICKET NUMBER
	public void cancelTicket(int ticketNo) {
		boolean  isTicketFound=false;
				Iterator<Ticket>itr=ticket.iterator();
		if(ticket.isEmpty()) {
			System.out.println("TICKET IS NOT BOOKED YET");
		}
		else {
			while(itr.hasNext()) {
				Ticket t=itr.next();
				if(t.getTicketNo()==ticketNo) {
					itr.remove();
					//isTicketFound=true;
					System.out.println("TICKET CANCELLED");
					isTicketFound=true;
				}
			}
		}
		if(isTicketFound==false) {
			System.err.println("ENTERED TICKET NUMBER IS INVALID");
		}
	}

	
	
	
	
	
	
	
	
	
	
	

}
