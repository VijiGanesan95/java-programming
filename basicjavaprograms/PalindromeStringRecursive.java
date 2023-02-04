package basicjavaprograms;
import java.util.*;
public class PalindromeStringRecursive {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean revString = palindromeStringRecursion(str,0,str.length()-1);
		if(revString) System.out.println("Its a palindrome");
		else System.out.println("Its not a palindrome");
	}
	public static boolean palindromeStringRecursion(String str,int i,int len) {
		if(str.length()==0 || str.length()==1)
			return true;
		if(str.charAt(i)!=str.charAt(str.length()-1-i))
			return false;
		else {//i++;len =str.length()-1;
			if(i<str.length()/2) return palindromeStringRecursion(str, i+1,len-1);}
		return true;
	}
}
