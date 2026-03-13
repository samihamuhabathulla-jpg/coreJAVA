package java_Array;

public class DiceGame {
	    public static void main(String[] args) {
	        int arun[] = {5, 6, 2, 1, 2, 5, 6, 3, 4, 2};
	        int naveen[] = {5, 5, 4, 3, 3, 5, 6, 2, 1, 1};
	        int arunTotal = 0;
	        int naveenTotal = 0;
	        for (int i = 0; i < 10; i++) {
	            arunTotal = arunTotal + arun[i];
	        }
	        for (int i = 0; i < 10; i++) {
	            naveenTotal = naveenTotal + naveen[i];
	        }
	        if (arunTotal > naveenTotal) {
	            System.out.println("Arun Wins!!!");
	        } else if (naveenTotal > arunTotal) {
	            System.out.println("Naveen Wins!!!");
	        } else {
	            System.out.println("Match Draw!!!");
	        }
	    }
	}


