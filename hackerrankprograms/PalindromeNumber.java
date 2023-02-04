package hackerrankprograms;
import java.util.Scanner;
public class PalindromeNumber{
	public static void main(String args[]) {
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int palinnum=obj.nextInt();
		int temp = palinnum,sum=0,r=0;
		while(temp>0) {
			r=temp%10;//1//2//1
			sum=sum*10+r;//1//(10+2)//(120+1)
			temp=temp/10;//12//1//0
		}
		if(sum==palinnum) {
			System.out.println("Its palindrome");
		}
		else
			System.out.println("Its not a palindrome");
	}
}