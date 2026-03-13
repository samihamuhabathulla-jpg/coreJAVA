package java_Array;

public class MergedArray {
	    public static int[] merge(int arr1[], int arr2[]) {

	        int arr3[] = new int[arr1.length + arr2.length];

	        for (int i = 0; i < arr1.length; i++) {
	            arr3[i] = arr1[i];
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            arr3[arr1.length + i] = arr2[i];
	        }

	        return arr3;  
	    }

	    public static void display(int arr[]) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        int arr1[] = {1, 2, 3};
	        int arr2[] = {4, 5, 6};

	        int arr3[] = merge(arr1, arr2);  // calling merge function

	        System.out.println("First Array:");
	        display(arr1);

	        System.out.println("Second Array:");
	        display(arr2);

	        System.out.println("Merged Array:");
	        display(arr3);
	    }
	}


