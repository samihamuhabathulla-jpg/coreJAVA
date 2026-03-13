package java_Array;

public class MissingNumber {
	
	    public static int findMissing(int arr[]) {

	        int totalSum = (100 * 101) / 2;   
	        int arraySum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            arraySum = arraySum + arr[i];
	        }

	        return totalSum - arraySum; 
	    }

	    public static void main(String[] args) {

	        int arr[] = new int[99];
	        int index = 0;

	        for (int i = 1; i <= 100; i++) {
	            if (i != 55) {   // skipping 55
	                arr[index] = i;
	                index++;
	            }
	        }

	        int missing = findMissing(arr);  
	        System.out.println("Missing number is: " + missing);
	    }
	}

