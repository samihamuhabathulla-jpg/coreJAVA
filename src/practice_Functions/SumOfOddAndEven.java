package practice_Functions;

public class SumOfOddAndEven {
	  static void findSum(int[] a) {

	        int even = 0;
	        int odd = 0;

	        for (int i = 0; i < a.length; i++) {

	            if (a[i] % 2 == 0) {
	                even = even + a[i];
	            } else {
	                odd = odd + a[i];
	            }
	        }

	        System.out.println("Even Sum = " + even);
	        System.out.println("Odd Sum = " + odd);
	    }

	    public static void main(String[] args) {

	        int[] numbers = {1, 2, 3, 4, 5};

	        findSum(numbers);  
	    }
	}


