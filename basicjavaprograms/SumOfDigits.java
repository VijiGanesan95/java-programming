package basicjavaprograms;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String args[]) {
		System.out.println("Enter the number:");
		Scanner obj= new Scanner(System.in);
		long num=obj.nextLong(),sum=0,temp=0;
		while(num!=0) {
			temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		System.out.println("the sum of digits in number:"+sum);
	}

}
