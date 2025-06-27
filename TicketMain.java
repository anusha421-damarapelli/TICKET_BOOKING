package com.ticket;

import java.util.Scanner;
import com.ticket.Irctc;
import com.ticket.Ticket;

public class TicketMain {
	public static void main(String[] args) {
		Irctc ir=new Irctc();
		Scanner sc=new Scanner(System.in);
		boolean status=true;
		while(status) {
			System.out.println("ENTER A CHOICE");
			System.out.println("1 FOR BOOK TICKET");
			System.out.println("2 FOR SHOW THE TICKET");
			System.out.println("3 FOR SEARCH TICKET BY TICKET NUMBER");
			System.out.println("4 FOR SEARCH TICKET BY BOARDING POINT");
			System.out.println("5 FOR UPDATE BOARDING POINT BY TICKET NUMBER");
			System.out.println("6 FOR UPDATE COST BY TICKET NUMBER");
			System.out.println("7 FOR CANCEL TICKET BY TICKET NUMBER");
			System.out.println("8 FOR EXIST");
			
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
			{
				System.out.println("ENTER THE TICKET NUMBER:");
				int ticketNo=sc.nextInt();
				System.out.println("ENTER THE BOARDING POINT:");
				String boardingPoint=sc.next();
				System.out.println("ENTER THE DESTINATION POINT:");
				String destinationPoint=sc.next();
				System.out.println("ENTER THE SEAT NUMBER:");
				int seatNo=sc.nextInt();
				System.out.println("ENTER THE TICKET COST:");
				int ticketCost=sc.nextInt();
				
	
				//Ticket t = new Ticket(ticketNo, boardingPoint, destinationPoint, seatNo, ticketCost);
				ir.ticketBooking(new Ticket(ticketNo,boardingPoint,destinationPoint,seatNo,ticketCost));
			}
			break;
			case 2:
			{
				ir.showBookedDetails();
			}
			break;
			case 3:
			{
				System.out.println("ENTER TICKET NUMBER:");
				int ticketNo=sc.nextInt();
				ir.searchTicket(ticketNo);
			}
			break;
			case 4:{
				System.out.println("ENTER THE BOARDING POINT:");
				String boardingPoint=sc.next();
				ir.searchBoardingPoint(boardingPoint);
			}
			break;
			case 5:
			{
				System.out.println("ENTER THE TICKET NUMBER:");
				int ticketNo=sc.nextInt();
				ir.updateCost(ticketNo);
			}
			break;
			case 6:
			{
				System.out.println("ENTER THE TICKET NUMBER:");
				int ticketNo=sc.nextInt();
				ir.cancelTicket(ticketNo);
			}
			break;
			case 7:
			{
				status=false;
				System.out.println("THANK YOU...");
			}
			default:System.err.println("ENTER INVALID CHOICE");
				
			}
		}
	}

}
