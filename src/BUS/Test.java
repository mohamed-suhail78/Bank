package BUS;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Busdetails> buses = new ArrayList<Busdetails>();
		ArrayList<Booking> booking = new ArrayList<Booking>();
		buses.add(new Busdetails (1,true,2));
		buses.add(new Busdetails (2,false,3));
		buses.add(new Busdetails (3,true,5));

		int useropt=1;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("_________________bus detail_______________________");
		for(Busdetails b: buses) {
			b.displayinfo();
		}
		System.out.println(" --------------- BUS booking system---------------");
		System.out.println("--------------------------------------------------");
		while (useropt==1) {
		System.out.println("enter 1 for booking process and 2 exit:");
		useropt = scanner.nextInt();
		if(useropt==1) {
			Booking booking1 = new Booking();
			if(booking1.isAvailable(buses,booking)) {
				booking.add(booking1);
				System.out.println("your booking  is confirmed");
				
				
			}
			else 
			{
				System.out.println("not available!!!!try different bus in different dates");
			}
			
		}
		
		}	
			
		}
		
	}


