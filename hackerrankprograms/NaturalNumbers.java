package hackerrankprograms;
import java.util.Scanner;
public class NaturalNumbers{
	public static void main(String args[]) {
		System.out.println("Enter range of natural numbers:");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		System.out.println(num);
		int sum=num*(num+1)/2;
		System.out.println(sum);
	}
}

/*package javasampleprogramming;
import java.util.Scanner;
public class NaturalNumbers {//1,2,3,4,5,6,7,8,9,...,N
	public static void main(String args[]) {
		System.out.println("Enter range of natural numbers:");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		System.out.println(num);
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("the sum of "+num+" natural number:"+sum);
	}
}*/

