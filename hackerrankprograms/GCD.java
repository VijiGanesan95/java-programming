package hackerrankprograms;

import java.util.Scanner;

public class GCD{
	public static void main(String args[]) {
		System.out.println("Enter the HCF numbers:");
		Scanner obj = new Scanner(System.in);
		String arr= obj.nextLine();
		System.out.println(arr);
		String[] arrNum1 = arr.split(" ");
		int len=arrNum1.length;
		int[] intArr=new int[len];
		System.out.println(len);
		int d=0,count=len-1;
		for(int i=0;i<=len-1;i++) {
			intArr[i]=Integer.valueOf(arrNum1[i]);
			System.out.println(intArr[i]);
		}
		for(int i=0;i<=len-1;i++) {
			if(i==0 && count!=0) {
				d = GCD(intArr[i],intArr[i+1]);
				count--;
				continue;
			}
			if(i>0 && i<len-1 && count!=0) {
				d=GCD(d,intArr[i+1]);
				count--;
				continue;
			}
			if(i>0 && i==len-1 && count!=0) {
				d=GCD(d,intArr[i+1]);
				count--;
				continue;
			}
		}
		System.out.println("The GCD :"+d);
	}
	public static int GCD(int a,int b) {
		while(a>0 && b>0) {
			if(a>b)
				a=a%b;
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
public class GCD{
	public static void main(String args[]) {
		int a =1872;
		int b=1320;
		int c=0;
		//int c=180;
		int d= GCD(a,b); 
		if(c!=0) {
			c= GCD(d,c);
			System.out.println("The GCD of three numbers:"+c);
		}
		else {
			System.out.println("The GCD of two numbers:"+d);
		}
			
	}
	public static int GCD(int a,int b) {
		while(a>0 && b>0) {
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			return a;
		else
			return b;
	}
}*/

/*package javasampleprogramming;
public class GCD{
	public static void main(String args[]) {
		int a=15;
		int b=10;
		while(a>0 && b>0) {
			if(a>b)
				a=a%b;
			else
				b=b%a;
		}
		if(a!=0)
			System.out.println("GCD:"+a);
		else
			System.out.println("GCD:"+b);
		
	}
}*/

/*package javasampleprogramming;

public class GCD {//quotient = dividend/divisor//remainder=dividend%divisor
	public static void main(String args[]) {
		int num_1=26;
		int num_2=91,rem_2;
		int rem_1=num_2%num_1;
		System.out.println(rem_1);
		if((rem_1!=0) && (num_1%rem_1==0)) {
			System.out.println("gcd:"+rem_1);
		}
		if((rem_1!=0) && (num_1%rem_1!=0)) {
			rem_2=num_1%rem_1;
			if((rem_2!=0)&&(rem_1%rem_2==0)) {
				System.out.println("gcd:"+rem_2);
			}
		}
		if((rem_1==0)) {
			System.out.println("gcd:"+num_1);
		}
	}
}
*/
