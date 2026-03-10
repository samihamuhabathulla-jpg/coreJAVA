package java_Array;

public class greatestElements {
	    public static void main(String[] args) {
	        int A[] = {12, 45, 7, 89, 34, 23};
	        int max = A[0];
	        for (int i = 1; i < A.length; i++) {
	            if (A[i] > max) {
	                max = A[i];
	            }
	        }
	        System.out.println("Greatest element in the array is: " + max);
	    }
	}


