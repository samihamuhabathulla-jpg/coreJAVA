package Practice_OOPS;

import java.util.Scanner;

public class Theater {

    int theaterid = 4523;
    String theaterName = "INOX";
    String theaterLocation = "Kochi";
  
    public void displayTheater() {
        System.out.println("Theater ID : " + theaterid);
        System.out.println("Theater Name : " + theaterName);
        System.out.println("Theater Location : " + theaterLocation);
    }

    public static void main(String[] args) {

        Theater t = new Theater();   
        t.displayTheater();          
    }
}
