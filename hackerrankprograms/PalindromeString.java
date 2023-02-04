package hackerrankprograms;
import java.util.Scanner;
public class PalindromeString{
	public static void main(String args[]) {
		System.out.println("Enter the string:");
		Scanner obj = new Scanner(System.in);
		String palinString = obj.nextLine();
		char[] palStr = palinString.toCharArray();
		int len=palinString.length();
		int hLen = (len%2==0)?len/2:(len/2)+1,d=hLen;
		char temp=0;
		for(int i=0;i<hLen;i++) {
			temp=palStr[i];
			palStr[i]=palStr[i+d+1];
			palStr[i+d+1]=temp;
			d=d-2;
		}
		String revStr=String.valueOf(palStr);
		System.out.println(revStr);
		if(palinString.equals(revStr)) {
			System.out.println("Its a palindromer String");
		}
		else
			System.out.println("Its not a palindrome");
	}
}


/*package javasampleprogramming;
import java.util.Scanner;
public class PalindromeString {//abcba
	public static void main(String args[]) {
		System.out.println("Enter the string:");
		Scanner obj = new Scanner(System.in);
		String palinString = obj.nextLine();
		String[] palArr = palinString.split("");
		int len = palArr.length;
		boolean isPalindrome=false;
		int halfLen = len/2,d=0;
		if(len%2==0) {
			halfLen = (len/2)-1;
			while(palinString.charAt(halfLen-d)==palinString.charAt(halfLen+d+1)) {
				d++;
				if(d<=halfLen) {
					isPalindrome=true;
					break;
				}
			}
		}
		else {//abcba//3
			halfLen = (len/2);
			while(palinString.charAt(halfLen+d+1) == palinString.charAt(halfLen-d-1)) {
				d++;
				if(d<=halfLen) {
					isPalindrome=true;
					break;
				}
			}
		}
		if(isPalindrome) {
			System.out.println("its palindrome");
		}
		else
			System.out.println("its not a palindrome");
	}
}*/
