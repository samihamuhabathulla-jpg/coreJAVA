package worksheet.java;

import java.util.Scanner;
	public class loop {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int c = 0;
			int n =sc.nextInt();
			int i = 0;
			while(i<n) {
				System.out.println("Hello");
				c++;
				if(i==n-1) {
					n = sc.nextInt();
					if(n < 0) {
						System.out.println("Hello has printed "+c+" times");
					}
					else {
						i = -1;
					}
				}
				i++;
			}
			
		}
}


