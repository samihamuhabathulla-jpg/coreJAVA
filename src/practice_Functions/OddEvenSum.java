package practice_Functions;

public class OddEvenSum {

	    static int sumOdd(int lower, int upper) {
	        int sum = 0;

	        for (int i = lower; i <= upper; i++) {
	            if (i % 2 != 0) {   
	                sum = sum + i;
	            }
	        }

	        return sum;
	    }

	    static int sumEven(int lower, int upper) {
	        int sum = 0;

	        for (int i = lower; i <= upper; i++) {
	            if (i % 2 == 0) {  
	                sum = sum + i;
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {

	        int lower = 1;
	        int upper = 1000;

	        int oddSum = sumOdd(lower, upper);
	        int evenSum = sumEven(lower, upper);

	        int difference = Math.abs(oddSum - evenSum);

	        System.out.println("The sum of odd numbers from 1 to 1000 is: " + oddSum);
	        System.out.println("The sum of even numbers from 1 to 1000 is: " + evenSum);
	        System.out.println("The absolute difference between the two sums is: " + difference);
	    }
	}


