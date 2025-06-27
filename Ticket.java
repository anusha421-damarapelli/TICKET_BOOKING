package com.ticket;

public class Ticket {
	private int ticketNo;
	private String boardingPoint;
	private String destinationPoint;
	private int seatNo;
	private int ticketCost;
	
	
	public Ticket(int ticketNo, String boardingPoint, String destinationPoint, int seatNo, int ticketCost) {
		super();
		this.ticketNo = ticketNo;
		this.boardingPoint = boardingPoint;
		this.destinationPoint = destinationPoint;
		this.seatNo = seatNo;
		this.ticketCost = ticketCost;
	}
	
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDestinationPoint() {
		return destinationPoint;
	}
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	
	public void display() {
		System.out.println("TICKET NUMBER:"+getTicketNo());
		System.out.println("BOARDING POINT:"+getBoardingPoint());
		System.out.println("DESTINATION POINT:"+getDestinationPoint());
		System.out.println("SEAT NUMBER:"+getSeatNo());
		System.out.println("TICKET COST:"+getTicketCost());
	
	}
	


}
