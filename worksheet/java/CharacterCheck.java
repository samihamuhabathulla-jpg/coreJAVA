package worksheet.java;
	import java.util.Scanner;
	public class CharacterCheck {
      public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char ch = Character.toLowerCase(sc.next().charAt(0));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				System.out.println("Vowel");
			}
			else if (ch>='b' && ch<='z') {
				System.out.println("Consonant");
			}
			else {
				System.out.println("Special character");
			}
		}

	}



