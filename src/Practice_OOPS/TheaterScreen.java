package Practice_OOPS;

public class TheaterScreen {
    private static int totalseats =20;
    TheaterScreen(){
	System.out.println("Current seat Availability:"+totalseats);
	}
public void displayTheaterScreen() {
	System.out.println("Current seat Availability:"+totalseats);
    }
public static void BookTicket(int nooftickets) {
	System.out.println("No.of Seats booked :"+nooftickets);
	totalseats=nooftickets;
    }
public static void main(String[]args) {
	System.out.println("Screen Total Availability Status");
	TheaterScreen TS1 = new TheaterScreen();
	TS1.BookTicket(4);
	TheaterScreen TS2 = new TheaterScreen();
	TS2.BookTicket(5);
	
    }
}
