package practice_Functions;
import java.util.Scanner;
public class PrimeNumbersRange {
	
	static void printPrimes(int x, int y) {
           for (int i = x; i <= y; i++) {

	            int count = 0;

	            for (int j = 1; j <= i; j++) {
	                if (i % j == 0) {
	                    count++;
	                }
	            }

	            if (count == 2) { 
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter starting number:");
	        int x = sc.nextInt();

	        System.out.println("Enter ending number:");
	        int y = sc.nextInt();

	        printPrimes(x, y);   

	        sc.close();
	    }
	}


