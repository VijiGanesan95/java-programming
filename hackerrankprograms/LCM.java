package hackerrankprograms;
import java.util.Scanner;
public class LCM{
	public static void main(String args[]) {
		System.out.println("Enter the LCM numbers:");
		Scanner obj = new Scanner(System.in);
		String arr=obj.nextLine();
		String[] arrStr = arr.split(" ");
		int len=arrStr.length,gcd=0,product=1,count=len-1;
		for(int i=0;i<len-1;i++) {}
		int[] arrNum = new int[len];
		int LCM=1;
		for(int i=0;i<=len-1;i++) {
			arrNum[i]=Integer.valueOf(arrStr[i]);
			System.out.println("the Lcm numbers:"+arrNum[i]);
		}
		for(int i=0;i<=len-1;i++) {
			if(i==0 && count!=0) {
				gcd= GCD(arrNum[i],arrNum[i+1]);
				LCM =(arrNum[i]*arrNum[i+1])/gcd;
				count--;
				continue;
			}
			if((i>0) && (i<len-1) &&count!=0) {
				gcd= GCD(arrNum[i+1],LCM);
				LCM =(LCM*arrNum[i+1])/gcd;
				count--;
				continue;
			}
			if((i>0) && (i==len-1) &&count!=0) {
				gcd= GCD(arrNum[i+1],LCM);
				LCM =(LCM*arrNum[i+1])/gcd;
				count--;
				continue;
			}
			System.out.println("the GCD of "+gcd);
			//product/gcd;
			System.out.println("the Lcm of "+LCM);
		}
		System.out.println("the Lcm numbers Length"+len);
		
	}
	public static int GCD(int a, int b) {
		while(a>0 && b>0) {
			if(a>b)
				a = a%b;
			else
				b=b%a;
		}
		if(a!=0)
			return a;
		else
			return b;
		
	}
}
/*package javasampleprogramming;
import java.util.Scanner;
public class LCM {
	public static void main(String args[]) {
		System.out.println("Enter the first number");
		Scanner obj = new Scanner(System.in);
		int a= obj.nextInt();
		System.out.println("Enter the second number");
		int b= obj.nextInt();
		System.out.println("the LCM of"+a+" "+b);
		int gcd= GCD(a,b);
		int LCM = (a*b)/gcd;
		System.out.println("the LCM of"+a+" "+b+"is"+LCM);
	}
	public static int GCD(int a, int b) {
		while(a>0 && b>0) {
			if(a>b)
				a = a%b;
			else
				b=b%a;
		}
		if(a!=0)
			return a;
		else
			return b;
		
	}
}*/
