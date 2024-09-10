package BUS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	private static final int booked = 0;
	String passengername;
	int Busno;
	Date date;


   Booking(){
	   Scanner scanner = new Scanner(System.in);	   
	   System.out.println("enter a name for passenger");
	   passengername =scanner.next();
	   System.out.println("enter the bus number");
	   Busno = scanner.nextInt();
	   System.out.println("enter a DATE into  a format  dd-mm-yyyy");
	   String dateInput = scanner.next();
	   SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
	   
	   try {
		date = dateFormat.parse(dateInput);
	} catch (ParseException e) {
		e.printStackTrace();
	}
   }
public boolean isAvailable(ArrayList<Busdetails> buses, ArrayList<Booking> booking) {
	int capacity=0;
	for(Busdetails busses:buses) {
		if (busses.getBusno()==Busno) {
			capacity=busses.getCapacity();
		}
	}
		int booked=0;
		for(Booking b:booking) {
			if (b.Busno== Busno&&b.date.equals(date)) {
				booked++;
			}
			}
			

	
	
	return booked<capacity?true:false;
	}}