package java_Array;

public class AddEvenNumbers {
	    public static void main(String[] args) {

	        int[] even = {2, 4, 6, 8, 10};   
	        int[] odd  = {1, 3, 5, 7, 9};    

	        int evenSum = 0;
	        int oddSum = 0;

	        for (int i = 0; i < even.length; i++) {
	            evenSum = evenSum + even[i];
	        }

	        for (int i = 0; i < odd.length; i++) {
	            oddSum = oddSum + odd[i];
	        }

	        System.out.println("Even sum = " + evenSum);
	        System.out.println("Odd sum = " + oddSum);
	    }
	}




