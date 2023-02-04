package hackerrankprograms;
import java.util.*;
public class PalindromeNumberRecursive {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int temp =palindromeRecursive(num,0);
		if(temp==num)
			System.out.println("Its a palindrome");
		else
			System.out.println("Its not a palindrome");
	}
	
	public static int palindromeRecursive(int num, int temp) {
		if(num==0)
			return temp;
		else {
			temp = (temp*10)+(num%10);
			return palindromeRecursive(num/10, temp);
		}
	}
}
