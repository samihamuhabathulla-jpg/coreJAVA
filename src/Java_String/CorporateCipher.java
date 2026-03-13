package Java_String;
	import java.util.Scanner;
	public class CorporateCipher {

	    public static String encrypt(String text) {

	        String result = "";

	        for (int i = 0; i < text.length(); i++) {

	            char ch = text.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	                ch = (char) ((ch - 'A' + 3) % 26 + 'A');
	                result = result + ch;
	            }

	            else if (ch >= 'a' && ch <= 'z') {
	                ch = (char) ((ch - 'a' + 3) % 26 + 'a');
	                result = result + ch;
	            }

	            else if (ch >= '0' && ch <= '9') {
	                result = result + ch;
	            }
	            else if (ch == ' ') {
	                result = result + '_';
	            }

	            else {
	                result = result + ch;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter message:");
	        String message = sc.nextLine();

	        String encrypted = encrypt(message);

	        System.out.println("Encrypted Message: " + encrypted);

	        sc.close();
	    }
	}


