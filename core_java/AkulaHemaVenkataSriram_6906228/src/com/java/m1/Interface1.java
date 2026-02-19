package com.java.m1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Interface1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Deluxe Room Details: ");
		System.out.print("Enter Guest Name: ");

		String guestName=sc.next();
		
		System.out.print("Rate per Night: ");
		double ratePerNight=sc.nextDouble();
		
		System.out.print("Nights Stayed: ");
		int nightsStayed=sc.nextInt();
		
		System.out.print("Joining Year: ");
		int joiningYear = sc.nextInt();
		
		System.out.println("Enter Suite Room Details: ");
		System.out.print("Enter Guest Name: ");

		String guestName1=sc.next();
		
		System.out.print("Rate per Night: ");
		double ratePerNight1=sc.nextDouble();
		
		System.out.print("Nights Stayed: ");
		int nightsStayed1=sc.nextInt();
		
		System.out.print("Joining Year: ");
		int joiningYear1 = sc.nextInt();
		
		HotelRoom obj = new HotelRoom("Deluxe",ratePerNight,guestName);
		HotelRoom obj1 = new HotelRoom("Suite",ratePerNight1,guestName1);
		
		System.out.println("Room Summary: ");
		System.out.println(obj.roomType+" Room: "+obj.getGuestName()+", "+
		obj.getRatePerNight()+" per night, Membership: "+obj.calculateMembershipYears(joiningYear));
		
		System.out.println(obj1.roomType+" Room: "+obj1.getGuestName()+", "+
				obj1.getRatePerNight()+" per night, Membership: "+obj1.calculateMembershipYears(joiningYear1));
		
		
		System.out.println("Total Bill: ");
		
		System.out.println("For "+obj.getGuestName()+" ("+obj.roomType+"): "+obj.calculateTotalBill(nightsStayed, joiningYear));
		System.out.println("For "+obj1.getGuestName()+" ("+obj1.roomType+"): "+obj1.calculateTotalBill(nightsStayed1, joiningYear1));

	}
}


interface Room{
	public double calculateTotalBill(int nightStayed,int joiningYear);
	public default int calculateMembershipYears(int joiningYear) {
		
		int year = 2026;
		
		return year - joiningYear;
	}
}

class HotelRoom implements Room{
	
	String roomType;
	double ratePerNight;
	String guestName;
	
	

	public HotelRoom(String roomType, double ratePerNight, String guestName) {
		this.roomType = roomType;
		this.ratePerNight = ratePerNight;
		this.guestName = guestName;
	}


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public double getRatePerNight() {
		return ratePerNight;
	}


	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}


	public String getGuestName() {
		return guestName;
	}


	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}


	public double calculateTotalBill(int nightsStayed,int joiningYear) {
		double total = nightsStayed*ratePerNight;
		
		if(calculateMembershipYears(joiningYear) > 3) {
			total-=total*0.1;
		}
		return Math.round(total);
	}
	

}









