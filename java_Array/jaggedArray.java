package java_Array;

public class jaggedArray {
	public static void main(String[]args) {
		int bookNo[][] = new int[6][];
		bookNo[0] = new int[] {1,2,3};
		bookNo[1] = new int[] {4,5};
		bookNo[2] = new int[] {6,7,8,9};
		bookNo[3] = new int[] {0,1,2};
		bookNo[4] = new int[] {5,8,9,3,2,1};
		bookNo[5] = new int[] {3,4};
		for(int i =0;i<bookNo.length;i++) {
		for(int j=0;j<bookNo[i].length;j++) {
		System.out.print(bookNo[i][j]+" ");
		}
	System.out.println();
   }
  }
}
